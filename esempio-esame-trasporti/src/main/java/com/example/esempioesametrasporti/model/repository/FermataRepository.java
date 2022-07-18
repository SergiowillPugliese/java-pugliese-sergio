package com.example.esempioesametrasporti.model.repository;

import com.example.esempioesametrasporti.model.Fermata;
import com.example.esempioesametrasporti.model.LineeFermate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FermataRepository {


    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "java";
    static final String PASS = "java";

    public static List<Fermata> getFermate(){
        // creo una lista da restituire
        List<Fermata> fermate = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id, nome, zona from fermate");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){

                // creo una fermata con i dati del DB
                Fermata fermata = new Fermata(rs.getInt("id"),rs.getString("nome"),rs.getString("zona"));
                // aggiungo alla lista
                fermate.add(fermata);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //restituisco la lista
        return fermate;
    }

    public static List<Fermata> getFermateByLinea(int linea){
        // creo una lista da restituire
        List<Fermata> fermate = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select fermata from fermate_linee where linea = ? ");
            stmt.setInt(1,linea);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){

                int numero_fermata = rs.getInt("fermata");
                // dato un id ottengo la fermata
                Fermata f = getFermataById(numero_fermata);
                // aggiungo alla lista
                fermate.add(f);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //restituisco la lista
        return fermate;
    }

    private static Fermata getFermataById(int numero_fermata) {
        // dichiaro l'oggetto da restituire
        Fermata fermata = null;
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id,nome,zona from fermate where id = ? ");
            stmt.setInt(1,numero_fermata);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                // istanzio l'oggetto da restituire preso dal DB
                fermata = new Fermata(rs.getInt("id"),rs.getString("nome"),rs.getString("zona"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //restituisco la Fermata
        return fermata;
    }

    public static List <LineeFermate> getLineeFermate () {

        List<LineeFermate> fermate = new ArrayList<LineeFermate>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT a.id, a.nome, c.id, c.nome, a.zona  FROM fermate as a JOIN fermate_linee as b ON a.id = b.id_fermate JOIN linee as c ON b.id_linea=c.id ORDER BY 2,4");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                LineeFermate lf = new LineeFermate();
                lf.setIdFermata(rs.getInt(1));
                lf.setNomeFermata(rs.getString(2));
                lf.setIdLinea(rs.getInt(3));
                lf.setNomeLinea(rs.getString(4));
                lf.setZona(rs.getString(5));
                fermate.add(lf);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //restituisco la lista
        return fermate;
    }

}
