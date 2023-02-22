package beginner.q1707;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int c = 1;
        int x = 0;
        int y = 0;
        while(c<=n*n){
            while (c<=n*n) {
                arr[x][y] = c++;
                y++;
                if (y == n || arr[x][y] != 0) {
                    x++;
                    y--;
                    break;
                }
            }
            while(c<=n*n){
                arr[x][y] = c++;
                x++;
                if(x == n || arr[x][y] != 0){
                    y--;
                    x--;
                    break;
                }
            }

            while(c<=n*n){
                arr[x][y] = c++;
                y--;
                if(y<0 || arr[x][y] != 0){
                    y++;
                    x--;
                    break;
                }
            }
            while(c<=n*n){
                arr[x][y] = c++;
                x--;
                if(arr[x][y] != 0){
                    x++;
                    y++;
                    break;
                }
            }
        }


        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ;j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
