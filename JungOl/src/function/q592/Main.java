package function.q592;

import java.util.Scanner;

public class Main {

	public int num(int n) {
		int res = 0;
		int r = 10;
		if (n / r == 0) {
			res = (n % (r / 10)) * n % (r / 10);
		} else {
			res += (n % r) * (n % r) + num(r * 10);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Main m = new Main();
		System.out.println(m.num(N));
	}
}
