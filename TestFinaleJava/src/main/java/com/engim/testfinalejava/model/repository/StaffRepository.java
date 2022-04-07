package com.engim.testfinalejava.model.repository;

import com.engim.testfinalejava.model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffRepository {
    static final String DB_URL = "jdbc:mysql://localhost:8081/progettoJava";
    static final String USER = "progettoJava";
    static final String PASS = "progettoJava";

    public static List<Staff>getStaff(){
        //creo la lista staff da restituire
        List<Staff> staffList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select * from staff");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Staff staff = new Staff(rs.getInt("id"), rs.getString("nome"), rs.getString("cognome"), rs.getString("mansione"), rs.getInt("admin"), rs.getString("password"));
                staffList.add(staff);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return staffList;
    }


}