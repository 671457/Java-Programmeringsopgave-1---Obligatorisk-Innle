package Oppgaver;

import static javax.swing.JOptionPane.*;

public class ObligatoriskO2 {

	public static void main(String[] args) {
		
		// b) skrev inn for løkke under (linje 12) gjør at den blir gjentatt 10 ganger)
		
		for (int i = 0; i < 10; i++) {
		
		final int MAKS = 100;
	    String poengLest = showInputDialog("Antall poeng: ");
	    int poeng = Integer.parseInt(poengLest);

	    String melding;
	    
	    if (poeng > 100) {
	      melding = "For stor poengsum, maks. " + MAKS + ".";
	    } else if (poeng >= 90) {
	      melding = "Karakteren er A.";
	    } else if (poeng >= 80) {
	      melding = "Karakteren er B.";
	    } else if (poeng >= 60) {
	      melding = "Karakteren er C.";
	    } else if (poeng >= 50) {
	      melding = "Karakteren er D.";
	    } else if (poeng >= 40) {
	      melding = "Karakteren er E.";
	    } else if (poeng >= 0) {
	      melding = "Karakteren er F.";
	   } else {
	     melding = "Poengsummen kan ikke være negativ.";
	     i = i - 1; // oppgave c) gjentas hvis du skriver feil.
	   }
	   showMessageDialog(null, melding);
	  
       }
	    
	}
}
