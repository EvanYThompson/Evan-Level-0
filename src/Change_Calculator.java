
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class Change_Calculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int x = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
		String Dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int k = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("How many quarters do you have");
		int f = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double
		// variable
		double total = (x * 0.05) + (f * 0.25) + (f * 0.1);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, total);
	}
}
