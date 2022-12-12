package q9042;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		while (true) {
			int num = sc.nextInt();
			sum += num;
			if (num == 0) {
				System.out.println("입력된 자료의 개수 = " + count);
				System.out.println("입력된 자료의 합계 = " + sum);
				System.out.printf("입력된 자료의 평균 = %.2f", (double) sum / count);
				break;
			}
			count++;
		}
		sc.close();
	}

}
