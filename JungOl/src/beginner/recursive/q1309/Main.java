package beginner.recursive.q1309;

import java.util.Scanner;

public class Main {

	long factorial(long n) {
		long result = 0;

		if (n == 1) {
			System.out.printf("%d! = %d\n", n, n);
			result = 1;
		} else {
			System.out.printf("%d! = %d * %d!\n", n, n, n - 1);
			result = n * factorial(n - 1);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Main m = new Main();
		System.out.println(m.factorial(n));

	}

}
