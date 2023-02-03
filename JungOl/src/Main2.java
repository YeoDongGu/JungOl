import java.util.Scanner;

public class Main2 {
    static int[] ar;
    static int n, m;

    public static void dice(int p) {
        if (p == m) {
            for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] + 1);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            ar[p] = i;
            dice(p + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        ar = new int[m];

        dice(0);
    }
}