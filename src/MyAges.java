import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		String age= JOptionPane.showInputDialog("how old are you");

		int time= Integer.parseInt(age);
		
		
		
		for (int i = 1; i < time+1; i++) {
			if (i == 1) {
				System.out.println("I've been " + i + " year old");
			}

			else if (i == time) {
				System.out.println("I am " + i + " years old");
			}

			else {
				System.out.println("I've been " + i + " years old");
			}

		}
	}
}
