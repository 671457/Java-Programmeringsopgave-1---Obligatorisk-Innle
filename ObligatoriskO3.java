package Oppgaver;

import static javax.swing.JOptionPane.*;


public class ObligatoriskO3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("skriv inn et heltall over 0"));
		int svar = 1;
		
		System.out.print(n + "! =");
		while(n > 0 ) {
			svar = svar*n;
			n--;
		}
	
		System.out.println(svar);
	}
}