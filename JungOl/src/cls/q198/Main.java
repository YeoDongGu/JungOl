package cls.q198;

import java.util.Scanner;

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

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parents[] pa = new Parents[2];
		int height;
		double weight;
		for (int i = 0; i < pa.length; i++) {
			height = sc.nextInt();
			weight = sc.nextDouble();
			pa[i] = new Parents(height, weight);
		}
		sc.close();

		int heSum = 0;
		double weSum = 0;

		for (int i = 0; i < pa.length; i++) {
			heSum += pa[i].getHeight();
		}
		for (int i = 0; i < pa.length; i++) {
			weSum += pa[i].getWeight();
		}

		int heAvg = (heSum / pa.length);
		double weAvg = (double) (weSum / pa.length);

		System.out.printf("height : %dcm\n", heAvg + 5);
		System.out.printf("weight : %.1fkg", weAvg - 4.5);
	}

}
