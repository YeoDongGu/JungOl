package cls.q616.ex1;

import java.util.Scanner;

class Triangle {
	double x;
	double y;

	Triangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp1 = sc.nextInt();
		double inp2 = sc.nextInt();
		double inp3 = sc.nextInt();
		double inp4 = sc.nextInt();
		double inp5 = sc.nextInt();
		double inp6 = sc.nextInt();
		sc.close();

		Triangle tri1 = new Triangle(inp1, inp2);
		Triangle tri2 = new Triangle(inp3, inp4);
		Triangle tri3 = new Triangle(inp5, inp6);

		System.out.printf("(%.1f, %.1f)", (tri1.x + tri2.x + tri3.x) / 3, (tri1.y + tri2.y + tri3.y) / 3);

	}
}
