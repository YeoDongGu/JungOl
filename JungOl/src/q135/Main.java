package q135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		int r = 0;

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if ((i % 3 == 0 || i % 5 == 0) && i != 0) {
					sum += i;
					r++;
				}
			}
		} else if (num2 < num1) {
			for (int i = num2; i <= num1; i++) {
				if ((i % 3 == 0 || i % 5 == 0) && i != 0) {
					sum += i;
					r++;
				}
			}
		} else {
			if ((num1 % 3 == 0 || num1 % 5 == 0) && num1 != 0) {
				sum = num1;
				r = 1;
			}

		}

		sc.close();
		double avg = (double) sum / r;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);

	}

}
