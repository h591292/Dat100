package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterskala {

		public static void main (String[] args) {
		
		int Poeng = 0;	

		
		for (int i=0;i<10;i++) {
		do {
				if (Poeng < 0 || Poeng > 100) {
					showMessageDialog(null,"Vennligst velg en gyldig poengsum");
				}
				Poeng = Integer.parseInt(showInputDialog("Skriv inn din poengsum"));
			} while (Poeng < 0 || Poeng > 100);
		
		if (Poeng <= 100 && Poeng >= 90) {
			showMessageDialog(null, "Din Karakter er A");
		}
		if (Poeng < 90 && Poeng >= 80) {
			showMessageDialog(null, "Din Karakter er B");
		}
		if (Poeng < 80 && Poeng >= 60) {
			showMessageDialog(null, "Din Karakter er C");
		}
		if (Poeng < 60 && Poeng >= 50) {
			showMessageDialog(null, "Din Karakter er D");
		}
		if (Poeng < 50 && Poeng >= 40) {
			showMessageDialog(null, "Din Karakter er E");
		}
		if (Poeng < 40 && Poeng >= 0) {
			showMessageDialog(null, "Din Karakter er F");
		}
		}
		}
}


