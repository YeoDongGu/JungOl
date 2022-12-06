package q545;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int num;
		int n3 = 0, n5 = 0;

		for (i = 0; i < 10; i++) {
			num = sc.nextInt();
			if (num % 3 == 0) {
				n3++;
			}
			if (num % 5 == 0) {
				n5++;
			}
		}

		System.out.println("Multiples of 3 : " + n3);
		System.out.println("Multiples of 5 : " + n5);
		sc.close();
	}
}
