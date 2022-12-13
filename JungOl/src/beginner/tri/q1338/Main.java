package beginner.tri.q1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		char[][] ch = new char[n][n];
		char c = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (i == 0) {
					for (int k = 0; k < n - (j + 1); k++) {
						ch[j][k] = ' ';
					}
				}
				ch[j + i][n - (j + 1)] = c; 
				c++;
				if (c > 'Z') {
					c = 'A';
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}

	}

}
