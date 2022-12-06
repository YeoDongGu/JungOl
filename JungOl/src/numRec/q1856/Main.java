package numRec.q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		int[][] num = new int[n1][n2];
		int r = 1;
		for (int i = 0; i < n1; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n2; j++) {
					num[i][j] = r++;
				}
			} else {
				for (int j = n2 - 1; j >= 0; j--) {
					num[i][j] = r++;
				}
			}
		}

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
