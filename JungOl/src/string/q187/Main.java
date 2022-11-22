package string.q187;

import java.util.Arrays;
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

			int count = 0;
			if (num > length) {
				for (int i = ch.length - 1; i >= 0; i--) {
					if (ch[i] != ' ') {
						ch[i] = ' ';
						break;
					}
				}
			} else {
				ch[num - 1] = ' ';
			}

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != ' ') {
					count++;
				}
			}
			if (count == 1) {
				break;
			}

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != ' ') {
					System.out.print(ch[i]);
				}
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
			System.out.println();
//			System.out.println(ch);

			System.out.println(Arrays.toString(ch));
			System.out.println(Arrays.toString(tmp));

		}
	}

}
