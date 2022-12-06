package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double weight = sc.nextDouble();
		sc.close();
		
		if (weight > 88.45) {
			System.out.print("Heavyweight");
		} else if (weight > 72.57) {
			System.out.print("Cruiserweight");
		} else if (weight > 61.23) {
			System.out.print("Middleweight");
		} else if (weight > 50.80) {
			System.out.print("Lightweight");
		} else {
			System.out.print("Flyweight");
		}

	}

}
