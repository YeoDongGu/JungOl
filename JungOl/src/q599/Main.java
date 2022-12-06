package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inp = sc.next();

		char[] arr = new char[100];

		for (int i = 0; i < inp.length(); i++) {
			arr[i] = inp.charAt(i);
			if ((int) arr[i] >= 65 && (int) arr[i] <= 89) {
				System.out.printf("%c", arr[i]);
			} else if ((int) arr[i] >= 97 && (int) arr[i] <= 122) {
				System.out.printf("%c", arr[i] - 32);
			}

		}
		sc.close();

	}

}
