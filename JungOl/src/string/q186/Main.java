package string.q186;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[2];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > max) {
				max = str[i].length();
			}
		}
		System.out.println(max);
	}

}
