package com.engim.lezione10.interfacce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    ArrayList<Forma> f;
    private final int WIDTH = 1200;
    private final int HEIGHT = 900;
    public Main() {
        setTitle("Forme");
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        f = new ArrayList<>();
        f.add(new Rettangolo(500,300));
        //f.add(new Quadrato(400));
    }



    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        for(Forma forma: f){
            forma.disegna(g,WIDTH/2,HEIGHT/2);
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
    }
}
