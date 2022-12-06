package q543;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		for (int i = 1; i <= inp; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
