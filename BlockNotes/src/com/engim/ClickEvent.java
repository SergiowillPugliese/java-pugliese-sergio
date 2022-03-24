package com.engim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickEvent implements ActionListener {

    //costruttore della clsse Gui
    private Gui gui;
    public ClickEvent(Gui gui){
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent e){
        //istanza classe fileManager che gli passa in parametro il testo
        FileManager fm = new FileManager(this.gui.getText());

        //label del pulsante che stiamo cliccando
        String cmd = e.getActionCommand();
        switch (cmd){
            case "Taglia":
                this.gui.text.cut();
            break;

            case "Copia":
                this.gui.text.copy();
            break;

            case "Incolla":
                this.gui.text.paste();
            break;

            case "Salva":
                //finestra di dialogo con stringa da metodo save
                JOptionPane.showMessageDialog(null, fm.save());
            break;

            case "Apri":
                if(!fm.loadFileText()){
                    //compare popup con testo corrente
                    JOptionPane.showMessageDialog(null, fm.getCurrentText());
                } else {
                    //imosta il testo della text area
                    this.gui.text.setText(fm.getCurrentText());
                    break;
                }

            case "Nuovo":
                this.gui.text.setText("");
            break;

            //funzionamento del size
            default:
                textUtils ut = new textUtils(this.gui);
                ut.setSize(Integer,parseInt(cmd));
            break;
        }
    }


}
