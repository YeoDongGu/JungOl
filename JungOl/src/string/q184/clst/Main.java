package string.q184.clst;

import java.util.Scanner;

class Input {
	private String str;

	public Input(String str) {
		this.str = str;
	}

	public void print() {
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

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		Input ip = new Input(str);

		ip.print();
	}

}
