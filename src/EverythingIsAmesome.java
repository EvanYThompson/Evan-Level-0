import javax.swing.JOptionPane;

public class EverythingIsAmesome {
	public static void main(String[] args) {
		String word=JOptionPane.showInputDialog("What is awesome");
		JOptionPane.showMessageDialog(null,word + " is awesome" );
		String word2=JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Your name is " + word2);
		
	}
	
	
	
	
}
