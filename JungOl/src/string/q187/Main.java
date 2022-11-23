package string.q187;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] ch = str.toCharArray();
		char[] tmp = new char[ch.length];
		int length = ch.length;
		while (true) {
			int num = sc.nextInt();

			if (num > length) {
				ch[length - 1] = ' ';

			} else {
				ch[num - 1] = ' ';
			}

			for (int i = 0, j = 0; i < ch.length; i++, j++) {
				if (ch[i] == ' ') {
					j--;
					continue;
				}
				tmp[j] = ch[i];
			}
			for (int i = 0; i < ch.length; i++) {
				ch[i] = tmp[i];
			}

			length--;
			for (int i = 0; i < length; i++) {
				System.out.print(ch[i]);
			}
			if (length == 1) {
				break;
			}
			System.out.println();

		}

	}

}
