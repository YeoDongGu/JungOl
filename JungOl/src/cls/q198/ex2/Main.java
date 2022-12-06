package cls.q198.ex2;

import java.util.Scanner;

class Student {
	private Parents[] pa;

	public Student() {
		Scanner sc = new Scanner(System.in);
		pa = new Parents[2];
		for (int i = 0; i < pa.length; i++) {
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			pa[i] = new Parents(height, weight);
		}
		sc.close();
	}

	public int stuHeight() {
		int sum = 0;
		for (int i = 0; i < pa.length; i++) {
			sum += pa[i].getHeight();
		}
		return (sum / pa.length) + 5;
	}

	public double stuWeight() {
		double sum = 0;
		for (int i = 0; i < pa.length; i++) {
			sum += pa[i].getWeight();
		}
		return (sum / pa.length) - 4.5;
	}

	public void print() {
		System.out.println("height : " + stuHeight() + "cm");
		System.out.printf("weight : %.1fkg", stuWeight());
	}
}

class Parents {
	private int height;
	private double weight;

	public Parents(int height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}

public class Main {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.print();
	}

}
