package com.engim.lezione12.db;

import java.sql.*;

public class JDBCExamplePrepareStatement {



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
            PreparedStatement stmt = conn.prepareStatement("select nome from liste where nome = ?");
            stmt.setString(1,"Macellaio");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                //Display values
               System.out.println(rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

