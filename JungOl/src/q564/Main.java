package q564;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		while (true) {
			char inp = sc.next().charAt(0);

			if ((int) inp >= 65 && (int) inp <= 90) {
				count[(int) inp - 65]++;
			} else {
				for (int i = 0; i < count.length; i++) {
					if (count[i] != 0) {
						System.out.printf("%c : %d\n", (char) (i + 65), count[i]);
					}
				}
				break;
			}

		}
		sc.close();

	}

}
