package cls.q617;

import java.util.Scanner;

class Information {
	String name;
	int height;

	public Information(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Information[] inf = new Information[5];

		for (int i = 0; i < inf.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			inf[i] = new Information(name, height);
		}
		sc.close();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < inf.length; i++) {
			if (inf[i].getHeight() < min) {
				min = inf[i].getHeight();
			}
		}

		for (int i = 0; i < inf.length; i++) {
			if (inf[i].getHeight() == min) {
				System.out.println(inf[i].getName() + " " + inf[i].getHeight());
			}
		}
	}
}
