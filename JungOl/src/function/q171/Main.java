package function.q171;

import java.util.Scanner;

class Math {
	private int num;

	public Math(int num) {
		this.num = num;
	}

	public void Calculate() {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		Math m = new Math(num);
		m.Calculate();

	}

}
