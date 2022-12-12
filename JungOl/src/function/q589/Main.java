package function.q589;

import java.util.Scanner;

public class Main {
	public int sum(int n) {
		int res = 0;
		if (n == 1) {
			res = 1;
		} else {
			res = n + sum(n - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		Main m = new Main();
		System.out.println(m.sum(N));
	}

}
