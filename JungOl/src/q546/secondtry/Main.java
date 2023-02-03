package q546.secondtry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg = 0;
        for(int i = 0 ; i<n; i ++){
            int score = sc.nextInt();
            avg += score;
        }
        avg = avg/n;
        if(avg>=80){
            System.out.printf("avg : %.1f\n",avg );
            System.out.println("pass");
        }else{
            System.out.printf("avg : %.1f\n",avg );
            System.out.println("fail");
        }
    }
}
