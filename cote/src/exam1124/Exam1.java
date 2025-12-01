package exam1124;

import java.util.Scanner;
public class Exam1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			System.out.println(n1+n2);
		}
		catch(InputMismatchException e) {
			System.out.println('X');
		}
		scanner.close();
		
	}
}
