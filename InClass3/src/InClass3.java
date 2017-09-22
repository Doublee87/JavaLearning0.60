import java.util.Random;


public class InClass3 {

	public static void main(String[] args) {
		String name = "ameen";
	System.out.println(name);
	char answer = name.charAt(0);
	System.out.println(answer);
	int len = name.length();
	System.out.println(len);
	char last = name.charAt(len -1);
	System.out.println(last);
	// skipping the step where stoing in a variable
	System.out.println( name.charAt(len -1));
	// skipping storing variable twice,,,, method inside a method
	System.out.println( name.charAt(name.length ()-1 ));
	// upper case letters
	String name2 = "almiftah";
	System.out.println(name.equalsIgnoreCase (name2));
	//System.out.println("hi there".charAt("hi there". length ())-1);
	//class named random
	//memorise how to creat a method ,,, click and import random 
	Random fred = new Random ();
	for (int i=0; i<5; i++){
		System.out.println( fred.nextInt(60) +1);
	
	}
	
	
	
	
	
	
	
	
	}

}
