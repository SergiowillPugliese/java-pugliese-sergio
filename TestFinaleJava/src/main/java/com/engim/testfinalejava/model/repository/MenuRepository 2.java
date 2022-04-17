package com.engim.testfinalejava.model.repository;

import com.engim.testfinalejava.model.Menu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    static final String DB_URL = "jdbc:mysql://localhost:3306/progetto";
    static final String USER = "progetto";
    static final String PASS = "progetto";

    public static List<Menu> getMenu(){
        //creo la lista staff da restituire
        List<Menu> menuList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM menu");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Menu menu = new Menu(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("prezzo"),
                        rs.getBoolean("categoria")
                );
                menuList.add(menu);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return menuList;
    }
}
