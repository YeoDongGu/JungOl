package q546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int sum = 0;
		double avg = 0;

		for (int i = 1; i <= r; i++) {
			int score = sc.nextInt();
			sum += score;
			avg = (double) sum / r;
		}
		
		
		
		System.out.printf("avg : %.1f\n", avg);

		if (avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		sc.close();

	}

}
