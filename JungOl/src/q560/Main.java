package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1001;
		for (int i = 0; i < 10; i++) {
			int inp = sc.nextInt();
			if (inp <= min) {
				min = inp;
			}
		}
		sc.close();
		System.out.println(min);

	}

}
