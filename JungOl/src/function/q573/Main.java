package function.q573;

import java.util.Scanner;

public class Main {

	public void outp(int x) {
		for (int i = 1; i <= x * x; i++) {
			System.out.print(i + " ");
			if (i % x == 0) {
				System.out.println();
			}
		}
// ================================================
//		이중 for 문으로 하는 방법
//		int c = 0;						
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < x; j++) {
//				System.out.println(c++ + " ");
//			}
//			System.out.println();
//		}
// =================================================
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Main main = new Main();

		main.outp(n);
	}

}
