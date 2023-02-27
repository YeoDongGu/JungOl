package cls.q199;

import java.util.Scanner;

class Score {
	Scanner sc = new Scanner(System.in);
	private Student[] stu;
	private int N = sc.nextInt();

	public Score() {

		stu = new Student[N];
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int math = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name, kor, math, eng);
		}
	}

	public void print() {
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getScore1() + " " + stu[i].getScore2() + " " + stu[i].getScore3()
					+ " " + ScoreSum(i));
		}
	}

	public void Sort() {
		Student[] tmp = new Student[N];
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length; j++) {
				if (ScoreSum(i) > ScoreSum(j)) {
					tmp[i] = stu[j];
					stu[j] = stu[i];
					stu[i] = tmp[i];
				}
			}
		}
	}

	public int ScoreSum(int x) {
		int sum = stu[x].getScore1() + stu[x].getScore2() + stu[x].getScore3();
		return sum;
	}
}

class Student {
	private String name;
	private int score1;
	private int score2;
	private int score3;

	public Student(String name, int score1, int score2, int score3) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public String getName() {
		return name;
	}

	public int getScore1() {
		return score1;
	}

	public int getScore2() {
		return score2;
	}

	public int getScore3() {
		return score3;
	}
}

public class Main {

	public static void main(String[] args) {

		Score soc = new Score();
		soc.Sort();
		soc.print();

	}

}
