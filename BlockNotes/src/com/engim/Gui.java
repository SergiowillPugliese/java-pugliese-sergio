package com.engim;
//verificare se fare le imort più specifiche
//import javax.swing.JFrame;
//import javax.swing.JTextArea;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;

//import automatica di tutte le classi javax.swing
import javax.swing.*;

public class Gui extends JFrame {

    //textArea è tutta la pagina
    public JTextArea text;

    public Gui(String title){
        //qui andiamo a passare il titolo
        super(title);

        //istanza della testarea (riga 15)
        text = new JTextArea();

        //aggiunge la textarea al frame ovvero alla pagina
        add(text);

        //metodo che imposta l'istanza che ritorna il metodo setupMenu()
        setJMenuBar(setupMenu());


        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private JMenuBar setupMenu(){
        //crea una barra di menù, ovvero la striscia
        // che conterrà il menù "file"
        JMenuBar mb = new JMenuBar();
        JMenu mfile = new JMenu("File");

        //Inserisce le opzioni presenti nel menù file
        JMenuItem miNew = new JMenuItem("Nuovo");
        JMenuItem miOpen = new JMenuItem("Apri");
        JMenuItem miSave = new JMenuItem("Salva");

        //aggiunge gli item alla categoria "file"
        mfile.add(miNew);
        mfile.add(miOpen);
        mfile.add(miSave);

        //istanza evento in java per ogni item di "file"
        miNew.addActionListener(new ClickEvent(this));
        miOpen.addActionListener(new ClickEvent(this));
        miSave.addActionListener(new ClickEvent(this));

        //crea menù "modifica"
        JMenu medit = new JMenu("Modifica");

        //Inserisce le opzioni presenti nel menù "Modifica"
        JMenuItem miCut = new JMenuItem("Taglia");
        JMenuItem miCopy = new JMenuItem("Copia");
        JMenuItem miPaste = new JMenuItem("Incolla");

        //aggiunge gli item alla categoria "Modifica"
        mfile.add(miCut);
        mfile.add(miCopy);
        mfile.add(miPaste);

        //istanza evento in java per ogni item di "Modifica"
        miCut.addActionListener(new ClickEvent(this));
        miCopy.addActionListener(new ClickEvent(this));
        miPaste.addActionListener(new ClickEvent(this));

        //crea menù "Size"
        JMenu msize = new JMenu("Size");

        //Inserisce le opzioni presenti nel menù "Size""
        JMenuItem mi5 = new JMenuItem("5");
        JMenuItem mi10 = new JMenuItem("10");
        JMenuItem mi25 = new JMenuItem("25");
        JMenuItem mi35 = new JMenuItem("35");
        JMenuItem mi48 = new JMenuItem("48");
        JMenuItem mi55 = new JMenuItem("55");
        JMenuItem mi72 = new JMenuItem("72");


        //aggiunge gli item alla categoria "Size"
        mfile.add(mi5);
        mfile.add(mi10);
        mfile.add(mi25);
        mfile.add(mi35);
        mfile.add(mi48);
        mfile.add(mi55);
        mfile.add(mi72);

        //istanza evento in java per ogni item di "Size"
        mi5.addActionListener(new ClickEvent(this));
        mi10.addActionListener(new ClickEvent(this));
        mi25.addActionListener(new ClickEvent(this));
        mi35.addActionListener(new ClickEvent(this));
        mi48.addActionListener(new ClickEvent(this));
        mi55.addActionListener(new ClickEvent(this));
        mi72.addActionListener(new ClickEvent(this));

        //menù principale
         mb.add(mfile);
         mb.add(medit);
         mb.add(msize);
         return mb;
    }

    //prende tutto il testo e va a capo
    public String getText(){
        String str ="";
        for (String line : text.getText().split("\\n"))
            str+=line+"\n";
        return str;
    }
}
