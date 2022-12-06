package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);
		sc.close();

		switch (ch) {

		case 'A':
			System.out.print("Excellent");
			break;
		case 'B':
			System.out.print("Good");
			break;
		case 'C':
			System.out.print("Usually");
			break;
		case 'D':
			System.out.print("Effort");
			break;
		case 'F':
			System.out.print("Failure");
			break;
		default:
			System.out.print("error");
			break;

		}

	}

}
