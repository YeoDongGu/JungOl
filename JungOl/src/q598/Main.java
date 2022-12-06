package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char inp = sc.next().charAt(0);

			if (inp > 64 && inp < 91) {
				System.out.println(inp);
			} else if (inp > 96 && inp < 123) {
				System.out.println(inp);
			} else if (inp > 47 && inp < 58) {
				System.out.println((int) inp);
			} else {
				break;
			}
		}
		sc.close();
	}

}
