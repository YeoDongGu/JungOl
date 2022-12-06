package q150;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] ch = new char[10];

		for (int i = 0; i < ch.length; i++) {
			char inp = sc.next().charAt(0);
			ch[i] = inp;
		}
		sc.close();
		for (int j = ch.length - 1; j >= 0; j--) {
			System.out.printf("%c ",ch[j] );
		}
	}

}
