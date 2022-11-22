package string.q184;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				System.out.print((char) (ch[i] + 32));
			} else if (ch[i] >= '0' && ch[i] <= '9') {
				System.out.print(ch[i]);
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				System.out.print(ch[i]);
			}
		}

	}

}
