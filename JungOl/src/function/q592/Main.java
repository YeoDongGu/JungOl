package function.q592;

import java.util.Scanner;

public class Main {

	public int num(int n) {
		int result = 0;
		if (n == 0) {
			result = 0;
		} else {
			result = (n % 10) * (n % 10) + num(n / 10);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		Main m = new Main();
		System.out.println(m.num(N));
	}
}
