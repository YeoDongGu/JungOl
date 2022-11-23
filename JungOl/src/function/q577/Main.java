package function.q577;

import java.util.Scanner;

class Math {
	int n1;
	int n2;

	public Math(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public void operator() {
		if (n1 > n2) {
			n1 = n1 / 2;
			n2 = n2 * 2;
		} else {
			n2 = n2 / 2;
			n1 = n1 * 2;
		}
		System.out.print(n1 + " " + n2);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Math m = new Math(n1, n2);
		m.operator();
	}

}
