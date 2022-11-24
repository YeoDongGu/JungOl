package function.q174;

import java.util.Scanner;

class Student {
	int kor;
	int eng;
	int math;

	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void print() {
		
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[3];
		for (int i = 0; i < stu.length; i++) {
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			stu[i] = new Student(kor, eng, math);
		}

	}

}
