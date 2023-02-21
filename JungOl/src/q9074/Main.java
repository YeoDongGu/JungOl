package q9074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        while(true){
            int inp = sc.nextInt();

            if(inp>10 || inp <1){
                break;
            }
            arr[inp-1] += 1;
        }

        for(int i = 0 ;i<10;i++){
            if(arr[i] >0){
                System.out.println((i+1) + " : " + arr[i] + "개");
            }
        }
    }
}
