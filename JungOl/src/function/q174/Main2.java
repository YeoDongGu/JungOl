package function.q174;

import java.util.Scanner;

class Student {
    private int score1;
    private int score2;
    private int score3;

    public Student(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void print() {
        System.out.println(score1 + " " + score2 + " " + score3 + " " + getSum());

    }
    public int getSum() {
        int sum ;
        sum = score1 + score2 + score3;
        return sum;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stu = new Student[3];
        int s1sum = 0;
        int s2sum = 0;
        int s3sum = 0;
        for (int i = 0; i < stu.length; i++) {
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            stu[i] = new Student(score1, score2, score3);
            s1sum += score1;
            s2sum += score2;
            s3sum += score3;
        }
        int sum = s1sum + s2sum + s3sum;

        for (int i = 0; i < stu.length; i++) {
            stu[i].print();
        }
        System.out.println(s1sum + " " + s2sum + " " + s3sum + " " + sum);
    }
}
