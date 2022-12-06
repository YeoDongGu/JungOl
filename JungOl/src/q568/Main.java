package q568;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] fArr = new int[2][4];
		int[][] sArr = new int[2][4];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				fArr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				sArr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("first array");
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(fArr[i][j] * sArr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
