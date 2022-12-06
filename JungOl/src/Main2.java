//package cls.q615;
//
//import java.util.Scanner;
//
//class Information {
//	String name;
//	int korean;
//	int eng;
//	int avg;
//
//	public Information(String n, int k, int e) {
//		name = n;
//		korean = k;
//		eng = e;
//	}
//}
//
//public class Main2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String n1 = sc.next();
//		int k1 = sc.nextInt();
//		int en1 = sc.nextInt();
//
//		String n2 = sc.next();
//		int k2 = sc.nextInt();
//		int en2 = sc.nextInt();
//		sc.close();
//
//		Information inf1 = new Information(n1, k1, en1);
//		Information inf2 = new Information(n2, k2, en2);
//
//		int avg1 = (inf1.korean + inf2.korean) / 2;
//		int avg2 = (inf1.eng + inf2.eng) / 2;
//		System.out.println(inf1.name + " " + inf1.korean + " " + inf1.eng);
//		System.out.println(inf2.name + " " + inf2.korean + " " + inf2.eng);
//		System.out.println("avg " + avg1 + " " + avg2);
//
//	}
//
//}
