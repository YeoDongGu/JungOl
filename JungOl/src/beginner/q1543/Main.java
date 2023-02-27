package beginner.q1543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        String result = "";

        if (B == 16) {
            while (N > 0) {
                int r = N % B;
                if (r >= 10) {
                    r = r - 10 + 'A';
                    result = String.valueOf((char) r) + result;
                    N /= B;
                    continue;
                }
                result = String.valueOf(r) + result;
                N /= B;
            }
            System.out.println(result);
        } else {
            while (N > 0) {
                result = String.valueOf(N % B) + result;
                N /= B;
            }
            System.out.println(result);
        }


    }
}
