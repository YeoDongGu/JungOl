package q9027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		sc.close();
		int res1 = (int) (n1 + n2);
		int res2 = (int) n1 + (int) n2;
		System.out.println(res1 + " " + res2);

	}

}
