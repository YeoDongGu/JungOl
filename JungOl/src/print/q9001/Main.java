package print.q9001;

public class Main {

	public static void main(String[] args) {
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = i; j < 3; j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			for (int j = 6; j > 6 - k; j--) {
				System.out.print(" ");
			}
			System.out.println("@");
			k += 2;
		}

		k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			for (int j = k; j < 4; j++) {
				System.out.print(" ");
			}
			System.out.println("@");
			k += 2;
		}
	}

}
