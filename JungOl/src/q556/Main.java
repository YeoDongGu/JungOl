package q556;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}

		sc.close();
	}

}
