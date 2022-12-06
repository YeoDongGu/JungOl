package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[10];

		for (int i = 0; i < ch.length; i++) {
			char w = sc.next().charAt(0);
			ch[i] = w;
		}
		sc.close();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		
	}

}
