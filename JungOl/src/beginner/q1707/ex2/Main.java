package beginner.q1707.ex2;

import java.util.Scanner;

//Jungol - Beginner - 3. - 1707
public class Main {
    public static enum Dir {
        RIGHT, DOWN, LEFT, UP
    };

    public static int inp;
    public static int x = 0, y = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();
        sc.close();
        int[][] ar = new int[inp][inp];
        int cnt = 1;
        Dir dir = Dir.RIGHT;

        // print array
//      for (int i = 0; i < ar.length; i++) {
//         for (int j = 0; j < ar[i].length; j++) {
//            System.out.print(ar[i][j] + " ");
//         }
//         System.out.println();
//      }

        if (inp == 1) {
            System.out.println(1);
        } else {
            while (cnt <= inp * inp) {
                ar[y][x] = cnt++;

                switch (dir) {
                    case RIGHT:
                        x++;
                        if (x == inp - 1 || ar[y][x + 1] != 0)
                            dir = Dir.DOWN;
                        break;
                    case DOWN:
                        y++;
                        if (y == inp - 1 || ar[y + 1][x] != 0)
                            dir = Dir.LEFT;
                        break;
                    case LEFT:
                        x--;
                        if (x == 0 || ar[y][x - 1] != 0)
                            dir = Dir.UP;
                        break;
                    case UP:
                        y--;
                        if (y == 0 || ar[y - 1][x] != 0)
                            dir = Dir.RIGHT;
                        break;
                }
            }

            // print array
//      System.out.println("------------------");
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.printf("%d ", ar[i][j]);
                }
                System.out.println();
            }
        }
    }
}