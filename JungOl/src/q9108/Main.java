package q9108;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            char c = sc.next().charAt(0);
            System.out.println(c + " -> " + (int) c);
            if(c == '0'){
                b = false;
            }
        }
    }
}
