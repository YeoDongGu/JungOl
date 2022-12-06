package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();
		
		switch (ch) {
		
		case 'M':
			if( age >= 18) {
				System.out.print("MAN");
			} else {
				System.out.print("BOY");
			}
			
			break;
			
		case 'F':
			if( age >= 18) {
				System.out.print("WOMAN");
			} else {
				System.out.print("GIRL");
			}
			
			break;
		}
		
		
	}

}
