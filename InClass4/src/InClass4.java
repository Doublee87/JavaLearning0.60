
public class InClass4 {
	private int big=1000;// this value can be used anywhere in the class. 
	private String address; // instance fields. can be used anywhere in CLASS. 
	
	public static void main(String[] args) {
		// you can do this
		//int fred = 15, larry = 3;
		//or this below...
		//String name = "CS161";
		//int count = adder(name.length(), larry);
		int count = adder (7,14); // 7 is going to x and 14 is going to a.. 
		//based on  order. and they are declared in another class.
		// these values need to be integers (int) to compile. 
		// the value returned to count is 21. 
		System.out.println(count);
		

	}
	public static int adder (int x, int a){//(parameter variables)>>> their scope is anywhere in the METHOD. 
		if (x>0){
			//System.out.println("this is a positive number");
			return x+a;
		}
	//int result = a+x; // result is a local variable. the result is going to be 21 here.
	//return result; // this will return an int variable. based on the public static class.
	System.out.println("this is a negative number");
	return x+a; // same thing. 
	}
	//public static int adder (double x, int a){ // this is used if the inputs are double and an int. 
		//return (int) (x+a); // return statement means return to where you called NOW...
		//no statements will compile after return. unless there is an if statement.
		
		
	//}
}

