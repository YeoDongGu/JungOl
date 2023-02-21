package cls.q197;

import java.util.Scanner;

class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }


    public int getY1() {
        return y1;
    }


    public int getX2() {
        return x2;
    }


    public int getY2() {
        return y2;
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] rec = new Rectangle[2];

        for (int i = 0; i < rec.length; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            rec[i] = new Rectangle(x1, y1, x2, y2);
        }
        sc.close();

        int x3 = Integer.MAX_VALUE;
        int y3 = Integer.MAX_VALUE;

        int x4 = Integer.MIN_VALUE;
        int y4 = Integer.MIN_VALUE;

        for (int i = 0; i < rec.length; i++) {
            if (rec[i].getX1() < x3) {
                x3 = rec[i].getX1();
            }
            if (rec[i].getY1() < y3) {
                y3 = rec[i].getY1();
            }
            if (rec[i].getX2() > x4) {
                x4 = rec[i].getX2();
            }
            if (rec[i].getY2() > y4) {
                y4 = rec[i].getY2();
            }
        }
        System.out.printf("%d %d %d %d", x3, y3, x4, y4);
    }
}
