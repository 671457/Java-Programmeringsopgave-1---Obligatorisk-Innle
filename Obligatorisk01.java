package Oppgaver;

import static javax.swing.JOptionPane.*;

public class Obligatorisk01 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 164100; i++)	{
			int Bruttoinntekt = Integer.parseInt(showInputDialog("Skriv inn lønnen din"));

			double Trinnskatt = (Bruttoinntekt);
			
			
			if(Bruttoinntekt < 164100) {
				Trinnskatt = (Bruttoinntekt * (0.00/100));
			}

			else if(Bruttoinntekt >= 164101 && Bruttoinntekt <= 230950) {
				Trinnskatt = (Bruttoinntekt*(0.93/100));
			}
				
			else if(Bruttoinntekt >= 230951 && Bruttoinntekt <= 580650) {
				Trinnskatt = (Bruttoinntekt * (2.41/100));
			}
				
			else if(Bruttoinntekt >= 580651 && Bruttoinntekt <= 934050) {
				Trinnskatt = (Bruttoinntekt * (11.52/100));
			}
				
			else if(Bruttoinntekt >= 934051) {
				Trinnskatt = (Bruttoinntekt * (14.52/100));
			}

			if(Bruttoinntekt < 0) {
				showMessageDialog(null,"ikke godkjent. Kan ikke legge inn negativ bruttolønn");
			}

		
			showMessageDialog(null,"Trinnskatten blir:  " + Trinnskatt + "kr");
		}
	}


}
