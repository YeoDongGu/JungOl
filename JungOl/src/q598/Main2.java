package q598;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char ch = sc.next().charAt(0);
            if ((ch<='Z' && ch>='A') || ch<='z' && ch>='a') {
                System.out.println(ch);
            } else if(ch>='0' && ch<='9'){
                System.out.println((int)ch);
            } else{
                break;
            }
        }
    }
}
