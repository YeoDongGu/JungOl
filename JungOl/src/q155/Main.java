package q155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		char[] ch = { 'J', 'U', 'N', 'G', 'O', 'L' };
		char inp = sc.next().charAt(0);
		sc.close();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == inp) {
				System.out.println(i);
			} else {
				count++;
				if (count == 6) {
					System.out.println("none");
				}
			}
		}

	}

}
