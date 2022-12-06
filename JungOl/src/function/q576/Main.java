package function.q576;

import java.util.Scanner;

public class Main {

	public void sum(int x, String str, int y) {
		int result = 0;
		if (str.equals("+")) {
			result = x + y;
		}
		if (str.equals("-")) {
			result = x - y;
		}
		if (str.equals("*")) {
			result = x * y;
		}
		if (str.equals("/")) {
			result = x / y;
		}
		System.out.printf("%d %s %d = %d", x, str, y, result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		String inp = sc.next();
		int num2 = sc.nextInt();
		sc.close();
		Main m = new Main();
		m.sum(num1, inp, num2);
	}

}
