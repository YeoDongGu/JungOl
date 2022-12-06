package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		boolean bol1 = n1 > n2 && n1 > n3;
		boolean bol2 = n1 == n2 && n1 == n3;
		System.out.println(bol1 + " " + bol2);
	}

}
