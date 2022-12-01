package cls.q9131;

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
		Information inf1 = new Information("손예준", 12);
		System.out.print("친한 친구의 이름과 나이를 입력하세요. ");
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		Information inf2 = new Information(name, age);

		System.out.println("당신의 이름 : " + inf1.getName() + ", 나이 : " + inf1.getAge());
		System.out.println("친구의 이름 : " + inf2.getName() + ", 나이 : " + inf2.getAge());
	}

}
