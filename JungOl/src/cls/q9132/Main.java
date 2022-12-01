package cls.q9132;

import java.util.Scanner;

class Student {
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
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
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name, kor, eng);
		}
		sc.close();

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getKor() + " " + stu[i].getEng());
		}

		int korsum = 0;
		int engsum = 0;

		for (int i = 0; i < stu.length; i++) {
			korsum += stu[i].getKor();
			engsum += stu[i].getEng();
		}

		System.out.println("합계 " + korsum + " " + engsum);
	}
}