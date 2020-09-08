package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Fakultet {
	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Velg en n-verdi"));
		int fakultet = 1;
		
		for (int i = 1; i<=n;i++) {
			fakultet *= i;
		}
	showMessageDialog(null,n+"! er lik " + fakultet);
		}
	}

