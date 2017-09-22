import org.omg.CORBA.PUBLIC_MEMBER;


public class InClass5 {

	public static void main(String[] args) {
		int x = 9;
		// to call a static method in a different class, className.methodName(value).
		double y = Math.sqrt(x);
		System.out.println(y);
		/*the math method compares two values at a time. */
		//Math.max(double a, double b);
		String str = "Oregon State!!!!!";
		int len = str.length();
		System.out.println(len);
		double z = Math.PI;
		System.out.println(z);
	}

		public static int problem(int x){
			int sum = 0;
			for (int i = 1; i<=x; i++){
				sum = sum + 1;
			}
			return sum;
		}
		}