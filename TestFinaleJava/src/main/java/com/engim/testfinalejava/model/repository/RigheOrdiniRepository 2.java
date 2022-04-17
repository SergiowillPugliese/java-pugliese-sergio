package com.engim.testfinalejava.model.repository;

import com.engim.testfinalejava.model.Ordini;
import com.engim.testfinalejava.model.RigheOrdini;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RigheOrdiniRepository {
    static final String DB_URL = "jdbc:mysql://localhost:3306/progetto";
    static final String USER = "progetto";
    static final String PASS = "progetto";

    public static List<RigheOrdini> getRigheOrdini(){
        //creo la lista staff da restituire
        List<RigheOrdini> righeOrdiniList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM righe_ordine");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                RigheOrdini r_ordini = new RigheOrdini(
                        rs.getInt("id_ordine"),
                        rs.getInt("id_menu")
                );
                righeOrdiniList.add(r_ordini);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return righeOrdiniList;
    }
}
