package beginner.rectangle.q1307.ex2;

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
				if(c > 'Z') {
					c='A';
				}
			}
		}

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
	}

}
