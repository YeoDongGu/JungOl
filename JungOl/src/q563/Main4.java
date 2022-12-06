package q563;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num1 = new int[10];
		int[] num2 = new int[10];
		for (int i = 0; i < num1.length; i++) {
			num1[i] = sc.nextInt();
		}
		sc.close();
		int in = 0;
		boolean flag = true;
		while (flag) {
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < num1.length; i++) {

				if (num1[i] > max) {
					max = num1[i];
				}
			}
			num2[in] = max;
			for (int i = 0; i < num1.length; i++) {
				if (num1[i] == max) {
					num1[i] = -1;
					break;
				}

			}
			if (in == 9) {
				flag = false;
			}
			in++;

		}
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("%d ", num2[i]);
		}

	}

}