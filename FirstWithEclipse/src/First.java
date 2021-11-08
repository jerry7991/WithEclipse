import java.util.Scanner;

public class First{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b=scan.nextInt();
		try {
			int c = a/b;
			System.out.println("Devision is :: "+c);
		}catch(NumberFormatException ex) {
			System.out.println("Exception is :: "+ex.getMessage());
		}
	}
}