package com.engim;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileManager {
    //costruttore
    private String text;
    public FileManager(String text){
        this.text = text;
    }

    public String save(){
        JFileChooser chooser = new JFileChooser("f:");
        int n = chooser.showSaveDialog(null);
        if (n == JFileChooser.APPROVE_OPTION){
            File f = new File(chooser.getSelectedFile().getAbsolutePath()+".txt");
            try {
                BufferedWriter w = new BufferedWriter(new FileWriter(f));
                w.write(this.text);
                w.flush();
                w.close();
                return "File salvato";
            } catch (Exception evt){
                return evt.getMessage();
            }
        }
        return "Operazione annullata";
    }
}

//https://www.youtube.com/watch?v=96Rm22MYZNg
//minuto 15:00