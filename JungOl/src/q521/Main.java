package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		scanner.close();

		int c = a++ * --b;

		System.out.printf("%d %d %d", a, b, c);

	}

}
