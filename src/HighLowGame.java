import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int random = new Random().nextInt(100);
		System.out.println(random);
		int guesses = 0;
		for (int i = 0; i < 100; i++) {

			String ok = JOptionPane.showInputDialog("What number am I thinking between one and one hundred?");
			int num = (Integer.parseInt(ok));
			if (random == num) {
				JOptionPane.showMessageDialog(null, "You are correct!");
				JOptionPane.showMessageDialog(null, "It took you " + guesses + " guesses");
			}
			if (random < num) {
				JOptionPane.showMessageDialog(null, "You are too high.");
				guesses = guesses + 1;
			}
			if (random > num) {
				JOptionPane.showMessageDialog(null, "You are too low.");
				guesses = guesses + 1;
			}
		}
	}

}
