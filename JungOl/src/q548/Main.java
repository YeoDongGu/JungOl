package q548;

public class Main {

	public static void main(String[] args) {
		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%-2d*%2d =%3d   ", i, j, i * j);
			}
			System.out.println();
		}

	}

}
