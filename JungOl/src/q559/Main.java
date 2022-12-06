package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] score = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		double sum = 0;
		for (int i = 0; i < 2; i++) {
			int inp = sc.nextInt();
			sum += score[inp-1];
		}
		sc.close();
		System.out.printf("%.1f", sum);

	}

}
