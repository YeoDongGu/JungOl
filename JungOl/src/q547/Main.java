package q547;

public class Main {

	public static void main(String[] args) {

		//for 문 안에 for문 활용
		
		for (int i = 1; i <= 5; i++) {
			for (int j = i + 1; j < i + 6; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
	}

}
