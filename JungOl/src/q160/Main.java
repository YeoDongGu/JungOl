package q160;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice[] = new int[6];
		for (int i = 0; i < 10; i++) {
			int roll = sc.nextInt();
			dice[roll - 1]++;
		}
		sc.close();

		for (int i = 0; i < dice.length; i++) {
			System.out.println(i + 1 + " : " + dice[i]);
		}

	}

}
