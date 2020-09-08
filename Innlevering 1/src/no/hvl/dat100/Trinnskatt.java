package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {
	
	public static void main (String[] args) {
		
		int brutto = Integer.parseInt(showInputDialog("Bruttoinntekt:"));
		double skatt = 0;	
		
		if (brutto > 180800){
				brutto -= 180800;
				
				if (brutto >= 73700) {			//intervallet 180 800 – 254 500
					skatt += (73700*0.019);
					brutto -= 73700;
				
						if (brutto >= 385250) {			//intervallet 254500 - 639 750
							skatt += (385250*0.042);
							brutto -= 385250;
				
								if (brutto >= 359800) {			//intervallet 639 750 - 999 550
									skatt += (359800*0.132);
									brutto -= 359800;
									System.out.println(brutto);
				
									if (brutto > 0) {				//inntekt over 999 550
										skatt += (brutto*0.162);
									}
									
								} else {skatt += (brutto*0.132);}
						} else {skatt += (brutto*0.042);}
				} else {skatt += (brutto*0.019);}
		}
			
		showMessageDialog(null, "din skatt er: " + skatt);
	}
}