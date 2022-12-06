package cls.q195;

import java.util.Scanner;

class Information {
	private String name;
	private String pnum;
	private String address;

	public Information(String name, String pnum, String address) {
		this.name = name;
		this.pnum = pnum;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String pnum = sc.next();
		String adress = sc.next();
		Information inf = new Information(name, pnum, adress);

		System.out.println("name : " + inf.getName());
		System.out.println("tel : " + inf.getPnum());
		System.out.println("addr : " + inf.getAddress());
	}

}
