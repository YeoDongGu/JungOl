package q9109;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String c = "";
        while (true) {
            c = sc.nextLine();
            str += c;
            if (c.equals("")) {
                break;
            }
        }
        System.out.println(str);
    }
}
