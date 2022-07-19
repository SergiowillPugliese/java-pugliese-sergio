package com.esame.esame.model.repository;

import com.esame.esame.constant.DBconnection;
import com.esame.esame.model.Fermate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FermateRepository {

    public static List<Fermate> getFermate(){
        List<Fermate> listaFermate = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(DBconnection.DB, DBconnection.USER, DBconnection.PSW);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM fermate");
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Fermate fermate = new Fermate(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getString("zona")
                );
                listaFermate.add(fermate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaFermate;
    }
}
