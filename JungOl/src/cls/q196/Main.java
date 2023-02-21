package cls.q196;

import java.util.Arrays;
import java.util.Scanner;

class Information {
	private String name;
	private String tel;
	private String address;

	public Information(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Information[] inf = new Information[3];
		for (int i = 0; i < inf.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String address = sc.next();
			inf[i] = new Information(name, tel, address);
		}
		sc.close();

		Information[] tmp = new Information[3];

		for (int i = 0; i < inf.length; i++) {
			for (int j = 0; j < inf.length - 1; j++) {
				if (inf[i].getName().charAt(0) < inf[j].getName().charAt(0)) {
					tmp[i] = inf[j];
					inf[j] = inf[i];
					inf[i] = tmp[i];
				}
			}
		}

		System.out.println("name : " + inf[0].getName());
		System.out.println("tel : " + inf[0].getTel());
		System.out.println("addr : " + inf[0].getAddress());

	}

}
