package function.q9093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3과목의 점수를 입력하세요. ");
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        Main m = new Main();
        m.wincheck(score1, score2, score3);

    }

    public void wincheck(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        if (avg < 60) {
            System.out.println("불합격");
        } else if (s1 < 40 || s2 < 40 || s3 < 40) {
            System.out.println("불합격");
        } else {
            System.out.println("축하합니다. 합격입니다.");
        }
    }

}
