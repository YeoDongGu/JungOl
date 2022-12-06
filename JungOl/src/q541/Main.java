package q541;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();
		
		for (int i = 1; i <= 20; i++) {
			System.out.print(ch);
		}	

	}

}
