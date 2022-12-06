package q508;

public class Test5 {

	public static void main(String[] args) {

		String[] str = { "item", "count", "price", "pen", "20", "100", "note", "5", "95", "eraser", "110", "97" };

		for (int i = 0; i <= 11; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%10s", str[i]);
		}

//		System.out.printf("%10s%10s%10s\n", "item", "count", "price");
//		System.out.printf("%10s%10d%10d\n", "pen", 20, 100);
//		System.out.printf("%10s%10d%10d\n", "note", 5, 95);
//		System.out.printf("%10s%10d%10d\n", "eraser", 110, 97);
//
//		System.out.println("      item     count     price");
//		System.out.println("       pen        20       100");
//		System.out.println("      note         5        95");
//		System.out.println("    eraser       110        97");
//
//		System.out.printf("%10s%10s%10s\n", str[0], str[1], str[2]);
//		System.out.printf("%10s%10d%10d\n", str[3], str[4], str[5]);
//		System.out.printf("%10s%10d%10d\n", str[6], str[7], str[8]);
//		System.out.printf("%10s%10d%10d\n", str[9], str[10], str[11]);

	}

}
