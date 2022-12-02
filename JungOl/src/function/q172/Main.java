package function.q172;

import java.util.Scanner;

public class Main {
	public static void numrec(int num) {
		for (int i = 1; i <= num; i++) {
			int result = 0;
			for (int j = 1; j <= num; j++) {
				result += i;
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		numrec(num);

	}

}
