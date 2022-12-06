package q540;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num != -1) {
			num = sc.nextInt();

			if (num % 3 != 0) {

			} else if (num % 3 == 0) {
				System.out.println(num / 3);
			} else if (num == -1) {
				break;
			}
		}
		sc.close();
	}

}
