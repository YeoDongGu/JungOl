package q112;

import java.util.Scanner;

class Num {
	private int num1;
	private int num2;

	public Num(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void print() {
		System.out.printf("%d / %d = %d...%d", num1, num2, num1 / num2, num1 % num2);

	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		Num n = new Num(num1, num2);

		n.print();

	}
}
