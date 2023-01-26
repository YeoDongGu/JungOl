package function.q174;

import java.util.Scanner;

class Student2 {
    int kor;
    int eng;
    int math;

    public Student2(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void print() {
        System.out.printf("%d %d %d %d\n", kor, eng, math, kor + eng + math);
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student2[] stu = new Student2[3];
        for (int i = 0; i < stu.length; i++) {
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            stu[i] = new Student2(kor, eng, math);
        }
        int korsum = 0;
        int engsum = 0;
        int mathsum = 0;
        for (int i = 0; i < stu.length; i++) {
            korsum += stu[i].getKor();
        }
        for (int i = 0; i < stu.length; i++) {
            engsum += stu[i].getEng();
        }
        for (int i = 0; i < stu.length; i++) {
            mathsum += stu[i].getMath();
        }
        for (int i = 0; i < stu.length; i++) {
            stu[i].print();
        }
        System.out.printf("%d %d %d %d", korsum, engsum, mathsum, korsum + engsum + mathsum);
    }

}