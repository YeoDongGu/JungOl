package string.q185;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = sc.next().charAt(0);
		sc.close();
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("No");
		}

	}

}
