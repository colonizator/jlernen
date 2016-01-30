/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mikhail
 * 
 * @aufgabe:
    1. Eingabebox fragt nach Namen
    2. Eingabe wird auf Gültigkeit getestet.
    3a. Keine Eingabe -> Programm wird beendet
    3b. Eingabe vorhanden -> weiter mit 4
    4. Abfragebox ob Name angezeigt werden soll
    5a. Wenn nein -> Programm wird beendet
    5b. Wenn ja -> weiter mit 6
    6. Informationsbox mit Name anzeigen
 */
public class Aufgabe1 {

    public static void main(String[] args) {
        int auswahl = 0;
        String eingabe = JOptionPane.showInputDialog(null, "Tragen Sie Ihren Namen ein", "die Nameeingabe", 
                JOptionPane.QUESTION_MESSAGE);
        
        if (auswahl == JOptionPane.OK_OPTION && eingabe != null) {
            JOptionPane.showMessageDialog(null, "Hallo " + eingabe, "das Ergebnis", 
                JOptionPane.PLAIN_MESSAGE);
            System.out.println("Hallo " + eingabe);
        } else {
          System.out.println("Bye stranger!");  
          System.exit(0);  
        }
        
        
    }
    
}
