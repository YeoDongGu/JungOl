package cls.q615;

import java.util.Scanner;

class Student {
	private String[] name;
	private int[] korean;
	private int[] eng;
	private int kAvg;
	private int eAvg;

	public Student(String[] name, int[] korean, int[] eng) {
		this.name = name;
		this.korean = korean;
		this.eng = eng;

		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < korean.length; i++) {
			sum += korean[i];
		}
		kAvg = sum / korean.length;

		for (int i = 0; i < eng.length; i++) {
			sum2 += eng[i];
		}
		eAvg = sum2 / eng.length;
	}

	public void print() {
		for (int i = 0; i < korean.length; i++) {
			System.out.println(name[i] + " " + korean[i] + " " + eng[i]);
		}

		System.out.println("avg" + " " + kAvg + " " + eAvg);
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();           
		String[] name = new String[2];
		int[] korean = new int[2];
		int[] eng = new int[2];
		for (int i = 0; i < 2; i++) {
			name[i] = sc.next();
			korean[i] = sc.nextInt();
			eng[i] = sc.nextInt();
		}
		sc.close();

		Student stu = new Student(name, korean, eng);

		stu.print();

	}
}
