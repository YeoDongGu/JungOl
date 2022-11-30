package beginner.rectangle.q1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		char c = 'A';
		char[][] ch = new char[n][n];

		// ch[][] 배열에 문자를 넣는 작업
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					ch[j][i] = c;
					c++;
					if ((int) c == 91) {
						c = 'A';
					}
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					ch[j][i] = c;
					c++;
					if ((int) c == 91) {
						c = 'A';
					}
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
