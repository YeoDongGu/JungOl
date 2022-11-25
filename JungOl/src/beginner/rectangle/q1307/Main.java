package beginner.rectangle.q1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		char c = 'A';
		char[][] ch = new char[n][n];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				ch[j][i] = c;
				c++;
				if ((int) c == 91) {
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
