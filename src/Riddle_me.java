import javax.swing.JOptionPane;

public class Riddle_me {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String henry = JOptionPane.showInputDialog("Yo moms so ugly");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (henry.equals("she died")) {
			JOptionPane.showMessageDialog(null, "your right");
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "you've done goofed");

		}
		// 6. Add some more riddles
		String riddle = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		
		if (riddle.equals("a quarter")) {
			JOptionPane.showMessageDialog(null, "your right");
			
			
		
			}		

		else {
			JOptionPane.showMessageDialog(null, "you've done goofed again");
	}
	}
}
//2. Make a pop up to show the score.

