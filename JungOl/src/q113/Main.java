package q113;

import java.util.Scanner;

class Rectangle {
	private int x;
	private int y;

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRectangleArea() {
		return x * y;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Rectangle rc = new Rectangle(x + 5, 2 * y);
		System.out.println("width = " + rc.getX());
		System.out.println("length = " + rc.getY());
		System.out.println("area = " + rc.getRectangleArea());
	}

}
