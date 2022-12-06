package function.q572;

import java.util.Scanner;

public class Main {

	public double area(double r) {
		return r * r * 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		Main main = new Main();
		System.out.printf("%.2f", main.area(inp));
	}

}
