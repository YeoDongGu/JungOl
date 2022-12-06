package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = sc.nextInt();
		sc.close();
//		int sum = 0;
//		int i = 1;
//		
//		while (i <= inp) {
//			sum += i;
//			i++;
//		}
//
//		System.out.println(sum);

//		int sum = 0;
//
//		for (int i = 1; i <= inp; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= inp);

		System.out.println(sum);
	}

}
