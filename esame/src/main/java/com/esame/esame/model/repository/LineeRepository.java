package com.esame.esame.model.repository;
import com.esame.esame.constant.DBconnection;
import com.esame.esame.model.Linee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LineeRepository {
    public static List<Linee> getLinee() {
        List<Linee> linee = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(DBconnection.DB, DBconnection.USER, DBconnection.PSW);
            PreparedStatement stmt = conn.prepareStatement("select id, nome from linee");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // creo una linea con i dati del DB
                Linee linea = new Linee(
                        rs.getInt("id"),
                        rs.getString("nome")
                );
                // aggiungo alla lista
                linee.add(linea);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linee;
    }

}

