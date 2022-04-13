package com.engim.testfinalejava.model.repository;

import com.engim.testfinalejava.model.Ordini;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdiniRepository {
    static final String DB_URL = "jdbc:mysql://localhost:3306/progetto";
    static final String USER = "progetto";
    static final String PASS = "progetto";

    public static List<Ordini> getOrdini(){
        //creo la lista staff da restituire
        List<Ordini> ordiniList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ordini");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Ordini ordini = new Ordini(
                        rs.getInt("id"),
                        rs.getInt("n_Coperti"),
                        rs.getInt("n_Tavolo"),
                        rs.getBoolean("pagato"),
                        rs.getInt("id_Staff")
                );
                ordiniList.add(ordini);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return ordiniList;
    }


}
