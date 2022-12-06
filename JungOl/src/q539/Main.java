package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int r = 0;
		int sum = 0;
		double avg = 0;
		while (true) {
			num = sc.nextInt();
			sum += num;
			r++;
			avg = (double) sum / r;

			if (num >= 100) {
				System.out.println(sum);
				System.out.printf("%.1f", avg);
				break;
			}
		}
		sc.close();
	}

}