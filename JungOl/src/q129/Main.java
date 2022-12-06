package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("Base = ");
			int base = sc.nextInt();
			System.out.printf("Height = ");
			int height = sc.nextInt();
			System.out.printf("Triangle width = %.1f\n", (double) height * (double) base / 2);
			System.out.printf("Continue? ");

			char ch = sc.next().charAt(0);

			if (ch != 'y' && ch != 'Y') {
				break;
			}

		}
		sc.close();
	}

}
