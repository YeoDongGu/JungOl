package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		char[] ch = str.toCharArray();
		for (int i = 1; i <= str.length(); i++) {
			for (int j = str.length() - i; j < str.length(); j++) {
				System.out.print(ch[j]);
			}
			for (int j = 0; j < str.length() - i; j++) {
				System.out.print(ch[j]);
			}

			System.out.println();
		}
	}

}