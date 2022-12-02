package q111;

import java.util.Scanner;

class Score {
	int kor;
	int eng;
	int math;
	int com;

	public Score(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getSum() {
		return kor + eng + math + com;
	}

	public int getAvg() {
		return (kor + eng + math + com) / 4;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int com = sc.nextInt();
		sc.close();
		Score sco = new Score(kor, eng, math, com);

		int sum = sco.getSum();
		int avg = sco.getAvg();
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);

	}

}
