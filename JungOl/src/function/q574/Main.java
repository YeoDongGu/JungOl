package function.q574;

import java.util.Scanner;

public class Main {

	public int max(int x, int y, int z) {
		int result = 0;
		if (x > y && x > z) {
			result = x;
		}
		if (y > x && y > z) {
			result = y;
		}
		if (z > x && z > y) {
			result = z;
		}
		if (x == y && x == z) {
			result = x;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		Main m = new Main();

		System.out.println(m.max(num1, num2, num3));
	}

}
