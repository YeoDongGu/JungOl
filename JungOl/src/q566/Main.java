package q566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[100];
		num[0] = 100;
		num[1] = sc.nextInt();
		sc.close();
		for (int i = 1; i < num.length; i++) {
			num[i + 1] = num[i - 1] - num[i];

			if (num[i + 1] < 0) {
				for (int j = 0; j <= i + 1; j++) {
					System.out.print(num[j] + " ");
				}
				break;
			}
		}

	}

}
