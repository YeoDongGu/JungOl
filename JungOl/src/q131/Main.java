package q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(num1 + " ");
				num1++;
			}

		} else if (num2 < num1) {
			for (int j = num2; j <= num1; j++) {
				System.out.print(num2 + " ");
				num2++;
			}

		} else {
			System.out.print(num1);
		}
		sc.close();
	}

}
