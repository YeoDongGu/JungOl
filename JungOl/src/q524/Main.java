package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 != 0 && num2 != 0) {
			System.out.print("true ");
		} else {
			System.out.print("false ");
		}

		if (num1 != 0 || num2 != 0) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}

	}

}
