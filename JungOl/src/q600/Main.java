package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String str = sc.nextLine();

		char[] ch = new char[100];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (str.charAt(i) == ' ') {
				count++;
			}
		}

		System.out.println(count + 1);
	}

}
