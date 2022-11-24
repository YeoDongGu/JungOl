package function.q173;

import java.util.Scanner;

class Math {
	private int num1;
	private int num2;

	public Math(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void Calculate() {
		if (num1 > num2) {
			System.out.println(num1 * num1 - num2 * num2);
		} else {
			System.out.println(num2 * num2 - num1 * num1);
		}
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		Math ma = new Math(num1, num2);
		ma.Calculate();
	}

}
