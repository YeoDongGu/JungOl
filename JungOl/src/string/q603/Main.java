package string.q603;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
