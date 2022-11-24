package function.q578;

import java.util.Scanner;

class MultiplicationTable {
	private int num1;
	private int num2;

	public MultiplicationTable(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;
	}

	public void calculate() {
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println("== " + i + "dan ==");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.println("== " + i + "dan ==");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
			}
		}
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		MultiplicationTable mt = new MultiplicationTable(num1, num2);
		mt.calculate();

	}

}
