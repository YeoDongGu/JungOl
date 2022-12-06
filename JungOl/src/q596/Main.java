package q596;

import java.util.Scanner;

public class Main {
	public void output(String x, int n) {
		if (x.length() > n) {
			for (int i = x.length() - 1; i >= x.length() - n; i--) {
				System.out.print(x.charAt(i));
			}
		} else {
			for (int i = x.length() - 1; i >= 0; i--) {
				System.out.print(x.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

		Main m = new Main();

		m.output(str, inp);

	}

}
