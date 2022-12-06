package function.q9085;

import java.util.Scanner;

public class Main {

	public int getSum(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	public int getDif(int n1, int n2) {

		int dif = 0;
		if (n1 > n2) {
			dif = n1 - n2;
		} else {
			dif = n2 - n1;
		}
		return dif;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		Main m = new Main();
		System.out.println("두 수의 합 = " + m.getSum(n1, n2));
		System.out.println("두 수의 차 = " + m.getDif(n1, n2));

	}

}
