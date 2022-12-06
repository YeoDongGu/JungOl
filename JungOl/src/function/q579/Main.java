package function.q579;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] inp = new int[n];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(inp);
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(inp[i] + " ");
		}

	}

}
