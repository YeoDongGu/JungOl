package q532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();
		sc.close();

		if (r1 >= 4.0 && r2 >= 4.0) {
			System.out.print("A");
		} else if (r1 >= 3.0 && r2 >= 3.0) {
			System.out.print("B");
		} else {
			System.out.print("C");
		}

	}

}
