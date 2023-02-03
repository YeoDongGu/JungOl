package beginner.q1175;

import java.util.Scanner;
public class Main {
    static int N, M;
    static int[] arr;

    private static void dice(int val, int sum) {
        int i;
        if (val > N) {
            if (sum == M) {
                String st = "";
                for (i = 1; i <= N; i++) {
                    st = st + arr[i] + " ";
                }
                System.out.println(st);
            }
            return;
        } else {
            for (i = 1; i <= 6; i++) {
                arr[val] = i;
                dice(val + 1, sum + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[N+1];
        dice(1, 0);
    }


}