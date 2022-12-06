package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp ;
		int i = 0 ;
		while (true) {
			inp = sc.nextInt();

			if (inp % 3 != 0 && inp % 5 != 0) {
				i++;
			} else if (inp == 0) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
