package com.engim.testfinalejava.model.repository;

import com.engim.testfinalejava.model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffRepository {
    static final String DB_URL = "jdbc:mysql://localhost:3306/progetto";
    static final String USER = "progetto";
    static final String PASS = "progetto";

    public static List<Staff>getStaff(){
        //creo la lista staff da restituire
        List<Staff> staffList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM staff");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Staff staff = new Staff(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("mansione"),
                        rs.getBoolean("admin"),
                        rs.getString("password")
                );
                staffList.add(staff);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return staffList;
    }


}