package beginner.q1430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int c = 1;
        int mul = A * B * C;
//        System.out.println(mul);
//        System.out.println((int) (Math.log10(mul) + 1));
        for (int i = 1; i <= (int) (Math.log10(mul) + 1); i++) {
            arr[(mul % (10 * c)) /c]++;
            c *= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
