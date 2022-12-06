package function.q574;

import java.util.Scanner;

public class Main2 {

	public int Ex(int[] x) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 		배열의 크기를 사용자가 정하고 싶을떄는
//		int N = sc.nextInt(); //배열의 크기를 정할 수를 입력하고 
// 		int[] ar = new int[N]; //입력한 수의 크기를가진 배열을 선언한다.

		int[] ar = new int[3];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		Main2 m = new Main2();
		int result = m.Ex(ar);
		System.out.println(result);
	}

}
