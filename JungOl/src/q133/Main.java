package q133;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
			sum += data[i];
		}

		double avg = (double) sum / n;
		System.out.printf("%.2f",avg);
		sc.close();
	}

}
