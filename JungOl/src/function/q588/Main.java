package function.q588;

import java.util.Scanner;

public class Main {
	public void num(int n) {
		if (n == 1) {
			System.out.print(n);
		} else {
			System.out.print(n + " ");
			num(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Main m = new Main();
		m.num(n);
	}

}
