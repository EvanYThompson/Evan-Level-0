import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2014

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeek {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Evan = "Sleep";
		String Varnit = "Everything";
		String Arnav = "Invisibility";
		String Danny = "knows nothing";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane.showInputDialog("Whose superpower do you want, Danny, Evan, Arnav, or Varnit");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (answer.equalsIgnoreCase("Evan")) {
			JOptionPane.showMessageDialog(null, Evan);
		}
		if (answer.equalsIgnoreCase("Varnit")) {
			JOptionPane.showMessageDialog(null, Varnit);
		}
		if (answer.equalsIgnoreCase("Arnav")) {
			JOptionPane.showMessageDialog(null, Arnav);
		}
		if (answer.equalsIgnoreCase("Danny")) {
			JOptionPane.showMessageDialog(null, Danny);
		}
	}
}
