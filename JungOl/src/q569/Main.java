package q569;

import java.util.Scanner;

class Student {
	private int kor;
	private int eng;
	private int math;
	private int sci;

	public Student(int kor, int eng, int math, int sci) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
	}

	public void print() {

		if (getAvg() >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public int getAvg() {
		return (kor + eng + math + sci) / 4;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[5];
		for (int i = 0; i < stu.length; i++) {
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			int sci = sc.nextInt();
			stu[i] = new Student(kor, eng, math, sci);
		}

		int count = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getAvg() >= 80) {
				count++;
			}
		}
		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}
		System.out.println("Successful : "+count);
		sc.close();
	}

}
