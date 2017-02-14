import javax.swing.JOptionPane;

public class Years_Alive {
public static void main(String[] args) {
	String year= JOptionPane.showInputDialog("when were you born");
	
	int time= Integer.parseInt(year);
	
	for (int i = 2017; i >= time; i--) {
		System.out.println(i+ " ");
	}
	
}
	
	
	
	
	
}
