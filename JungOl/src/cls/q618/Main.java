package cls.q618;

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
		// 이름 순으로 정렬
		Information[] tmp = new Information[5]; // 배열 정렬을 위해 빈 배열 생성
		System.out.println("name");
		for (int i = 0; i < inf.length; i++) {
			for (int j = 0; j < inf.length - 1; j++) {
				if (inf[i].getName().charAt(0) < inf[j].getName().charAt(0)) {
					tmp[i] = inf[j];
					inf[j] = inf[i];
					inf[i] = tmp[i];
				}
			}
		}
		for (int i = 0; i < inf.length; i++) {
			System.out.println(inf[i].getName() + " " + inf[i].getHeight() + " " + inf[i].getWeight());
		}
		System.out.println();

		// 몸무게 순으로 정렬
		for (int i = 0; i < inf.length; i++) {
			for (int j = 0; j < inf.length - 1; j++) {
				if (inf[i].getWeight() > inf[j].getWeight()) {
					tmp[i] = inf[j];
					inf[j] = inf[i];
					inf[i] = tmp[i];
				}
			}
		}
		System.out.println("weight");
		for (int i = 0; i < inf.length; i++) {
			System.out.println(inf[i].getName() + " " + inf[i].getHeight() + " " + inf[i].getWeight());
		}
	}

}
