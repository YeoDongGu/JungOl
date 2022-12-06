package q565;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[100];
		int[] count = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] == 0) {
				break;
			}
			count[num[i] / 10]++;

		}
		sc.close();
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println(i + " : " + count[i]);
			}
		}
	}

}
