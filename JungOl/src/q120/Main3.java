package q120;

import java.util.Scanner;

public class Main3 {

	public int Ex(int x, int y) {
		int result = 0;
		if (x > y) {
			result = x - y;
		} else {
			result = y - x;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Main3 m = new Main3();

		System.out.println(m.Ex(num1, num2));
	}

}
