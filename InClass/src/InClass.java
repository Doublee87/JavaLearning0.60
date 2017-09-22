
public class InClass {
	public static void main(String[] args) {
		first();
		third();
		second();
		third();
	}
	public static void first() {
		System.out.println("inside first method");
		third();
		}
	public static void second() {

		System.out.println("inside second method");
		
		}
	public static void third() {
		System.out.println("inside third method");
		second();
		}
	int x = 12;
	//System.out.println(" ");

}
