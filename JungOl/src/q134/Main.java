package q134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		for (int i = 0; i < 10; i++) {
			int inp = sc.nextInt();
			if (inp % 2 == 0 && inp != 0) {
				even++;
			} else if (inp % 2 != 0) {
				odd++;
			}
		}
		System.out.printf("even : %d\n", even);
		System.out.printf("odd : %d", odd);
		sc.close();
	}

}
