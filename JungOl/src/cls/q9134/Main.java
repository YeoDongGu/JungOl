package cls.q9134;

import java.util.Scanner;

class Center {
	private Point[] p;

	public Center(int[] p) {
		this.p = new Point[2];
		for (int i = 0, j = 0; i < this.p.length; i++, j += 2) {
			this.p[i] = new Point(p[j], p[j + 1]);
		}
	}

	public double getXcen() {
		double result = 0;
		for (int i = 0; i < p.length; i++) {
			result += p[i].getX();
		}
		return result / p.length;
	}

	public double getYcen() {
		double result = 0;
		for (int i = 0; i < p.length; i++) {
			result += p[i].getY();
		}
		return result / p.length;
	}

	public void cenPrint() {
		System.out.printf("중심점의 위치 = (%.1f, %.1f)", getXcen(), getYcen());
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
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
		Scanner sc = new Scanner(System.in);
		int[] p = new int[4];
		for (int i = 0; i < p.length; i++) {
			if (i % 2 == 0) {
				System.out.print("점의 좌표는?(x,y) ");
			}
			p[i] = sc.nextInt();
		}
		sc.close();
		Center cen = new Center(p);
		cen.cenPrint();
	}

}
