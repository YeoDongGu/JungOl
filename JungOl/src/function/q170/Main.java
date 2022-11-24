package function.q170;

class Atsign {
	private String order;

	public Atsign(String order) {
		this.order = order;
	}

	public void print() {
		System.out.println(order);
		System.out.println("@@@@@@@@@@");
	}
}

public class Main {

	public static void main(String[] args) {
		Atsign as1 = new Atsign("first");
		Atsign as2 = new Atsign("second");
		Atsign as3 = new Atsign("third");

		as1.print();
		as2.print();
		as3.print();

	}

}
