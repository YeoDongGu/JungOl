package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;

		while (true) {
			int inp = sc.nextInt();

			if (inp % 2 == 0 && inp != 0) {
				even++;
			} else if (inp % 2 != 0) {
				odd++;
			} else if (inp == 0) {
				System.out.println("odd : " + odd);
				System.out.println("even : " + even);
				break;
			}
		}
		sc.close();
	}
}
