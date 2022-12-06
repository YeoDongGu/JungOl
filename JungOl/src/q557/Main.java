package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] ch = new char[10];

		for (int i = 0; i < ch.length; i++) {
			char inp = sc.next().charAt(0);
			ch[i] = inp;
		}

		System.out.print(ch[0] + " " + ch[3] + " " + ch[6]);
		sc.close();
	}

}
