package cls.q9136;

import java.util.Scanner;

class Information {
	private String name;
	private int height;
	private double weight;

	public Information(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
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
		Scanner sc = new Scanner(System.in);
		Information[] inf = new Information[5];
		for (int i = 0; i < inf.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			inf[i] = new Information(name, height, weight);
		}
		sc.close();

		Information[] tmp = new Information[inf.length];
		for (int i = 0; i < inf.length; i++) {
			for (int j = 0; j < inf.length; j++) {
				if (inf[i].getHeight() < inf[j].getHeight()) {
					tmp[0] = inf[j];
					inf[j] = inf[i];
					inf[i] = tmp[0];
				}
			}
		}
		for (int i = 0; i < inf.length; i++) {
			System.out.printf("%s %d %.1f\n", inf[i].getName(), inf[i].getHeight(), inf[i].getWeight());
		}

	}

}
