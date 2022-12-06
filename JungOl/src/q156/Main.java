package q156;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int max = 0;
		int min = 1000;
		for (int i = 0; i < arr.length; i++) {
			int inp = sc.nextInt();
			arr[i] = inp;

			if (arr[i] == 999) {
				System.out.printf("max : %d\n", max);
				System.out.printf("min : %d", min);
				break;
			} else if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
			
		}
	}

}
