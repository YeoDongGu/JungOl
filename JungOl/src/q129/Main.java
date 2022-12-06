package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = 1;
		int height = 1;
		char ch;
		while (true) {
			base = sc.nextInt();
			height = sc.nextInt();
			System.out.printf("Base = ");
			System.out.printf("Height = ");
			System.out.printf("Triangle width = %.1f\n", (double) height * (double) base / 2);
			System.out.printf("Continue? ");

			ch = sc.next().charAt(0);

			if (ch == 'y' || ch == 'Y') {

			} else {
				break;
			}
		}
		sc.close();
	}

}
