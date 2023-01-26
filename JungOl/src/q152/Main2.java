package q152;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                int n = sc.nextInt();
                oddsum += n;
            } else{
                int n = sc.nextInt();
                evensum += n;
            }
        }
        System.out.println("odd : " + oddsum);
        System.out.println("even : " + evensum);
    }
}
