
public class DieTester {
	public static void main(String[] args) {
		InClass6 d0 = new InClass6 ();
		InClass6 d1 = new InClass6('A');
		InClass6 d2 = new InClass6('B');
		InClass6 d3 = new InClass6('C');

		d1.roll();
		d2.roll();
		d3.roll();
		d0.roll();
		System.out.println(d0.getSideUp());
		System.out.println(d1.getSideUp());
		System.out.println(d2.getSideUp());
		System.out.println(d3.getSideUp());
		d3.setSideUp(0);
		System.out.println(d3.getSideUp());
		



		
	}

}
