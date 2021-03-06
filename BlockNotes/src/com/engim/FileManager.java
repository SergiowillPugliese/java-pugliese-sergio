package com.engim;

import javax.swing.*;
import java.io.*;

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

    public boolean loadFileText(){
        JFileChooser chooser = new JFileChooser("f:");
        int r = chooser.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION){
            File f = new File(chooser.getSelectedFile().getAbsolutePath());
            try {
                String line = "", text = "";
                BufferedReader br = new BufferedReader(new FileReader(f));
                text = br.readLine();

                while((line = br.readLine()) != null){
                    text += "\n" + line;
                }
                this.text = text;
                return true;
            } catch (Exception evt){
                this.text = "error: " + evt.getMessage();
                return false;
            }
        }
        return false;
    }
    public String getCurrentText(){
        return this.text;
    }
}
