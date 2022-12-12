package q9043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (true) {
			int num = sc.nextInt();
			if (num % 2 != 0) {
				sum += num;
				count++;
			}
			if (num == 0) {
				System.out.println("홀수의 합 = " + sum);
				System.out.println("홀수의 평균 = " + sum / count);
				break;
			}
		}

	}

}
