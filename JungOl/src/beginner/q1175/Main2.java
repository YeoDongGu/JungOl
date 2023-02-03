package beginner.q1175;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static int N;
    static int M;

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        Arrays.fill(arr, 1);
        while (true) {
            roll();
            if (arr[0] > 6) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            if (sum == M) {
                print();
            }

        }
    }

    public static void roll() {
        arr[arr.length - 1] += 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 6) {
                arr[i] = 1;
                arr[i - 1] += 1;
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > 6) {
                    arr[j] = 1;
                    arr[j - 1] += 1;
                }
            }
        }
    }

    public static void print() {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
