package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;

		while (true) {
			System.out.print("number? ");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("positive integer");
			} else if (num < 0) {
				System.out.println("negative number");
			} else if (num == 0) {
				break;
			}
		}
		sc.close();

	}

}
