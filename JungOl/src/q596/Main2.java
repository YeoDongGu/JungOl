package q596;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int inp = sc.nextInt();

		if (str.length() > inp) {
			for (int i = str.length() - 1; i >= str.length() - inp; i--) {
				System.out.print(str.charAt(i));
			}
		} else {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
		}

		sc.close();
	}

}
