package function.q9084;

import java.util.Scanner;

public class Main {
	public void starprint(int n) {
		int c = n;
		for (int i = 0; i < n; i++, c--) {
			for (int j = c - 1; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Main m = new Main();
		m.starprint(n);
	}

}
