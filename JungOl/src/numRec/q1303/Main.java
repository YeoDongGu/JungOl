package numRec.q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 1;
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(r + " ");
				r++;
			}
			System.out.println();
		}
	}

}
