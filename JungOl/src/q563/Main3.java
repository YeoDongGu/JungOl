package q563;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d ", num[i]);
		}

	}

}
