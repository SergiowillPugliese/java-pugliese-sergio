package com.engim.lezione10.panel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null,"Inserisci un nome");
        JOptionPane.showMessageDialog(null,"Ciao " + a, "Titolo", JOptionPane.INFORMATION_MESSAGE);

    }
}
