package com.engim.testfinalejava.model.repository;

import com.engim.testfinalejava.model.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminRepository {
    static final String DB_URL = "jdbc:mysql://localhost:8889/gestionale";
    static final String USER = "gestionale";
    static final String PASS = "gestionale";

    public static List<Admin>getStaff(){
        //creo la lista staff da restituire
        List<Admin> staffList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM staff");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Admin staff = new Admin(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("mansione"),
                        rs.getBoolean("admin"),
                        rs.getString("password")
                );
                staffList.add(staff);
            }
            conn.close();
            stmt.close();

        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return staffList;
    }

    public static Admin insertStaff(Admin staff){
        try{
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement stmt = conn.prepareStatement(
                    "" + "INSERT INTO staff " +
                            "(id,nome, cognome, mansione,admin,password) VALUE (?,?,?,?,?,?)");
            stmt.setInt(1,staff.getId());
            stmt.setString(2, staff.getNome());
            stmt.setString(3,staff.getCognome());
            stmt.setString(4,staff.getMansione());
            stmt.setBoolean(5,staff.isAdmin());
            stmt.setString(6,staff.getPassword());
            int row = stmt.executeUpdate();

            conn.close();
            stmt.close();
            return staff;
        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    //metodo di cancellazione. Chiedere  Filippo se ha senso usare il payload
}
