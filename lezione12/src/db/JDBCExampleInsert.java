package com.engim.lezione12.db;

import java.sql.*;

public class JDBCExampleInsert {



//   SQLInjection
//    str ="' or 1 = 1 or '"
//    "SELECT nome from liste where user = '" + str + "' and pwd='"+pwd+"';"

    /*SELECT */
    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "java";
    static final String PASS = "java";
    static final String QUERY = "SELECT nome FROM liste";

    public static void main(String[] args) {
        // Open a connection
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO liste VALUES (?)");
            stmt.setString(1,"Fruttivendolo");
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

