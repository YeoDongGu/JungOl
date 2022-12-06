package q154;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] weight = new double[6];
		double sum = 0;
		for (int i = 0; i < weight.length; i++) {
			double inp = sc.nextDouble();
			weight[i] = inp;
			sum += weight[i];
		}
		sc.close();
		System.out.printf("%.1f", sum / (double)weight.length);
	}

}
