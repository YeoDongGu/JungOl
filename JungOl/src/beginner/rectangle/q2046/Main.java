package beginner.rectangle.q2046;

import java.util.Scanner;

class Rectangle {
	private int n;
	private int m;

	public Rectangle(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public void print() {
		if (m == 1) {
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		} else if (m == 2) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < n; j++) {
						System.out.print((j + 1) + " ");
					}
				} else {
					for (int j = n; j >= 1; j--) {
						System.out.print(j + " ");
					}
				}
				System.out.println();
			}
		} else if (m == 3) {
			for (int i = 1; i <= n; i++) {
				int r = i;
				for (int j = 0; j < n; j++) {
					System.out.print(r + " ");
					r += i;
				}
				System.out.println();
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		Rectangle rc = new Rectangle(n, m);
		rc.print();
	}

}
