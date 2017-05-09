import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String month = JOptionPane.showInputDialog("What is your Birthday month?");
		if (month.equalsIgnoreCase("January")) {
			JOptionPane.showMessageDialog(null, "Yours is a Capricorn ");
		}
		if (month.equalsIgnoreCase("febuary")) {
			JOptionPane.showMessageDialog(null, "Yours is a Aquaeius ");
		}
		if (month.equalsIgnoreCase("march")) {
			JOptionPane.showMessageDialog(null, "Yours is a Pisces ");
		}
		if (month.equalsIgnoreCase("April")) {
			JOptionPane.showMessageDialog(null, "Yours is a Aries ");
		}
		if (month.equalsIgnoreCase("May")) {
			JOptionPane.showMessageDialog(null, "Yours is a Taurus");
		}
		if (month.equalsIgnoreCase("June")) {
			JOptionPane.showMessageDialog(null, "Yours is a Gemini");
		}
		if (month.equalsIgnoreCase("July")) {
			JOptionPane.showMessageDialog(null, "Yours is a cancer");
		}
		if (month.equalsIgnoreCase("august")) {
			JOptionPane.showMessageDialog(null, "Yours is a Leo");
		}
		if (month.equalsIgnoreCase("September")) {
			JOptionPane.showMessageDialog(null, "Yours is a Virgo");
		}
		if (month.equalsIgnoreCase("October")) {
			JOptionPane.showMessageDialog(null, "Yours is a scoprio");
		}
		if (month.equalsIgnoreCase("november")) {
			JOptionPane.showMessageDialog(null, "Yours is a Sagittarius");
		}
	}

}