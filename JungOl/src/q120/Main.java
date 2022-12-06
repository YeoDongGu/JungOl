package q120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Main2 m = new Main2();

		System.out.println(m.Ex(num1, num2));
	}

}
