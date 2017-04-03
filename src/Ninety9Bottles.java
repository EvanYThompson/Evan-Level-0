
public class Ninety9Bottles {
	public static void main(String[] args) {
		for (int i = 99; i > 0; i--) {
			String num= " Bottles of milk on the wall";
			System.out.println( i + num);
			System.out.println("Take 1 down, pass it around");
			
			System.out.println(i-1 + " bottles of milk on the wall");
			System.out.println("");
		}
	}
}
