package function.q575;

import java.util.Scanner;

public class Main {

	public int ex(int x, int y) {
		int result = x;
		for (int i = 0; i < y - 1; i++) {
			result *= x;
		}
		if (y == 0) {
			result = 1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Main m = new Main();

		System.out.println(m.ex(num1, num2));
	}
}
