// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		String answer=JOptionPane.showInputDialog("Do you like bananas?");
		if (answer.equals("no")) {
			JOptionPane.showMessageDialog(null,"your insane");
		}
		else if(answer.equals("yes")) {
		String ans2 = JOptionPane.showInputDialog("What is your favorite hobby");
			JOptionPane.showMessageDialog(null, ans2+" is much better than bananas");
		}
		else {
			JOptionPane.showMessageDialog(null,"You are bananas");
		}
		//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}
