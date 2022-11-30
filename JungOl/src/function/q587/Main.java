package function.q587;

import java.util.Scanner;

class Recursive {
	int N;

	public Recursive(int N) {
		this.N = N;
	}

	public void print(int num) {
		if (num == N) {
			return;
		} else {
			System.out.println("recursive");
			print(num + 1);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		Recursive rc = new Recursive(N);

		rc.print(0);
	}

}
