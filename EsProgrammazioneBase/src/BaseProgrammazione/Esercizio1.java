package BaseProgrammazione;

import javax.swing.*;
public class Esercizio1
{
    // --------------------------------------------------------------------------
    // http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
    // --------------------------------------------------------------------------
    public static void main(String[] args)
    {
        String s;
        // ----------------------------------------------------------------------------------------
        // Finestra di dialogo con 3 bottoni con etichetta personalizzata
        // argomento1 => componente padre (deve essere un frame, una componente in un frame o null)
        // argomento2 => testo che spiega la richiesta
        // argomento3 => titolo sulla finestra
        // argomento4 => icona : JOptionPane.INFORMATION_MESSAGE, JOptionPane.ERROR_MESSAGE ,
        //               JOptionPane.WARNING_MESSAGE, JOptionPane.QUESTION_MESSAGE,
        //               JOptionPane.PLAIN_MESSAGE (nessuna icona)
        // argomento5 => bottoni : JOptionPane.DEFAULT_OPTION, JOptionPane.YES_NO_OPTION,
        //               JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION
        // ----------------------------------------------------------------------------------------
        // showInputDialog con listbox
        // ----------------------------------------------------------------------------------------
        Object[] Valori = {"showInputDialog", "showOptionDialog", "showMessageDialog"};
        s=(String)JOptionPane.showInputDialog(null,"Scegli il tipo di finestra di dialogo da provare: ", "Input con ListBox",
                JOptionPane.QUESTION_MESSAGE,
                null,       // indico che non voglio usare un'icona personalizzata
                Valori,     // i valori nel listbox
                Valori[0]); // valore di default
        if (s==Valori[0])
        {
            // ----------------------------------------------------------------------------------------
            // showInputDialog: Finestra di dialogo per chiedere all'utente un valore
            // ----------------------------------------------------------------------------------------
            s=JOptionPane.showInputDialog(null, "Digita qualcosa: ","Titolo Finestra",JOptionPane.QUESTION_MESSAGE);
            // Finestra di dialogo con messaggio - Utile per avvisare l'utente
            s="Hai digitato: " + s;
        }
        else if (s==Valori[1])
        {
            Object[] Etichette = {"Bottone SI", "Bottone NO", "Bottone CANCEL"};
            int risposta = JOptionPane.showOptionDialog(null,
                    "Clicca su uno dei bottoni: ", "Titolo: Esempio showOptionDialog",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,          // indico che non voglio usare un'icona personalizzata
                    Etichette,     // le etichette dei bottoni
                    Etichette[2]); // etichetta del bottone di default
           /* -- Esempio con 2 bottoni
           int risposta = JOptionPane.showConfirmDialog(null,
                                                   "Clicca su uno dei bottoni: ", "Titolo: Esempio showOptionDialog",
                                                   JOptionPane.YES_NO_CANCEL_OPTION ); // etichette dei bottoni standard
           */
            if (risposta==JOptionPane.YES_OPTION)
                s="Hai cliccato su \"Bottone SI\"";
            else if (risposta==JOptionPane.NO_OPTION)
                s="Hai cliccato su \"Bottone NO\"";
            else if (risposta==JOptionPane.CANCEL_OPTION)
                s="Hai cliccato su \"Bottone CANCEL\"";
            else
                s="Non hai cliccato su nessun bottone SI, NO, CANCEL";
        }
        else if (s==Valori[2])
        {
            JOptionPane.showMessageDialog(null, "Esempio di \"showMessageDialog\"","titolo",JOptionPane.WARNING_MESSAGE);
            System.exit(0); // Uscita dal programma
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Non hai selezionato alcuna finestra di dialogo","titolo",JOptionPane.ERROR_MESSAGE);
            System.exit(0); // Uscita dal programma
        }
        JOptionPane.showMessageDialog(null, s,"titolo",JOptionPane.INFORMATION_MESSAGE);
    }
}
