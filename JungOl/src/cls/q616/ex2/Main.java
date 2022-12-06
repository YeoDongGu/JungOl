package cls.q616.ex2;

import java.util.Scanner;

class CenterOfGravity {
	Scanner sc = new Scanner(System.in);
	private Triangle[] tri;

	public CenterOfGravity() {
		tri = new Triangle[3];
		for (int i = 0; i < tri.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			tri[i] = new Triangle(x, y);
		}
//		for (int i = 0; i < tri.length; i++) {
//			tri[i].print();
//		}
	}

	public double getXcog() {
		double sum = 0;
		for (int i = 0; i < tri.length; i++) {
			sum += tri[i].getX();
		}
		return (double) (sum / tri.length);
	}

	public double getYcog() {
		double sum = 0;
		for (int i = 0; i < tri.length; i++) {
			sum += tri[i].getY();
		}
		return sum / tri.length;
	}

	public void Printcog() {
		System.out.printf("(%.1f, %.1f)", getXcog(), getYcog());
	}
}

class Triangle {
	private int x;
	private int y;

	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

public class Main {

	public static void main(String[] args) {
		CenterOfGravity cog = new CenterOfGravity();
		cog.Printcog();
	}

}
