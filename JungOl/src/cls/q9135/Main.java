package cls.q9135;

import java.util.Scanner;

class Bank {
	private int money;

	public Bank(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank[] b = new Bank[5];
		for (int i = 0; i < b.length; i++) {
			System.out.print((i + 1) + "번 저축금액은? ");
			int m = sc.nextInt();
			b[i] = new Bank(m);
		}
		sc.close();

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < b.length; i++) {
			if (b[i].getMoney() > max) {
				max = b[i].getMoney();
			}
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i].getMoney() == max) {
				System.out.printf("저축왕 %d번 %d원", i + 1, b[i].getMoney());
			}
		}

	}

}
