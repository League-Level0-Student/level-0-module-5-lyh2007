package algorithms;

import javax.swing.JOptionPane;

public class Primeornot {
	public static void main(String[] args) {
		boolean izzy = true;
		int num = 90;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				JOptionPane.showMessageDialog(null, "It is not PRIME! HAHAHAHAHA");
				izzy = false;
				break;
			}

		}
		if (izzy == true)
			JOptionPane.showMessageDialog(null, "It is PRIME! AWWWWW!");
	}
}
