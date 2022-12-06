package q571;

import java.util.Scanner;

public class Main {

	String str = "~!@#$^&*()_+|";

	void outp() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		Main main = new Main();
		for (int i = 0; i < N; i++) {
			main.outp();
		}
	}

}