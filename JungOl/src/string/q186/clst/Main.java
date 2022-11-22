package string.q186.clst;

import java.util.Scanner;

class Input {
	private String str;

	public Input(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public int getLength() {
		return str.length();
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Input[] ip = new Input[2];
		for (int i = 0; i < ip.length; i++) {
			String str = sc.next();
			ip[i] = new Input(str);
		}
		sc.close();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ip.length; i++) {
			if (ip[i].getLength() > max) {
				max = ip[i].getLength();
			}
		}
		System.out.println(max);
	}

}
