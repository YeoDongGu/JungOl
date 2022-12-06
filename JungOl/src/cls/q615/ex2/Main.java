package cls.q615.ex2;

import java.util.Scanner;

class Student {
	private String name;
	private int korean;
	private int eng;

	public Student(String name, int korean, int eng) {
		this.name = name;
		this.korean = korean;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public int getEng() {
		return eng;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[2];
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int korean = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name, korean, eng);
		}
		sc.close();

		int kSum = 0;
		int eSum = 0;
		for (int i = 0; i < stu.length; i++) {
			kSum += stu[i].getKorean();
			eSum += stu[i].getEng();
		}

		int kAvg = kSum / stu.length;
		int eAvg = eSum / stu.length;

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getKorean() + " " + stu[i].getEng());
		}
		System.out.println("avg " + kAvg + " " + eAvg);

	}

}
