package q528;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		sc.close();
		
		System.out.println(num1);
		
		if(num1 < 0) {
			System.out.print("minus");
		}
	}
}
