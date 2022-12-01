package cls.q9130;

import java.util.Scanner;

class Information {
	private String name;
	private int age;

	public Information(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.next();
		System.out.print("당신의 나이는 몇 살입니까? ");
		int age = sc.nextInt();
		sc.close();
		Information inf = new Information(name, age);

		System.out.println("당신의 이름은 " + inf.getName() + "이고 나이는 " + inf.getAge() + "세이군요.");

	}

}
