package q522;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		// == 연산자 : 두 변수가 같으면 true 다르면 false
		// != 연산자 : 두 변수가 같지않으면 true 같으면 false
		System.out.println(num1 == num2 ? true : false);
		System.out.println(num1 != num2 ? true : false);
		

	}

}
