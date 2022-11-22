package string.q182;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		sc.close();
		System.out.printf("%d %d", ch1 + ch2, Math.abs(ch1 - ch2));

	}

}
