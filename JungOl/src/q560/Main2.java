package q560;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int min = 1001;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

			if (num[i] < min) {
				min = num[i];
			}
		}
		sc.close();
		System.out.println(min);
	}

}
