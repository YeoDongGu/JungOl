package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("ASCII code =? ");
			int inp = sc.nextInt();
			char ch = (char) inp;
			
			if (inp < 128 && inp > 32) {
				System.out.println(ch);
			} else {
				break;
			}
		}
		sc.close();
	}

}
