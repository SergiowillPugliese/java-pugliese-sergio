package com.esame.esame.model.repository;


import com.esame.esame.constant.DBconnection;
import com.esame.esame.model.Preventivo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Preventivorepository {
    public static List<Preventivo> getPreventivi() {
        List<Preventivo> preventivo = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(DBconnection.DB, DBconnection.USER, DBconnection.PSW);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM preventivi");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // creo una linea con i dati del DB
                Preventivo preventivi = new Preventivo(
                        rs.getInt("id"),
                        rs.getString("azienda"),
                        rs.getString("piano"),
                        rs.getInt("max_fermate"),
                        rs.getInt("max_extraurbane"),
                        rs.getInt("max_zone"),
                        rs.getDouble("prezzo")
                );
                // aggiungo alla lista
                preventivo.add(preventivi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preventivo;
    }
}
