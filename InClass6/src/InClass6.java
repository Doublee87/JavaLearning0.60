import java.util.Random;


public class InClass6 { // die game
	private static Random rand = new Random (); // class variable 
	private int s1,s2,s3,s4,s5,s6;
	private int sideUp = s1; // instance field (can be used anywhere in the class)
	
	public InClass6(){ // overloading.. two methods with the same name but different parameter types. 
		s1=1;
		s2=2;
		s3=3;
		s4=4;
		s5=5;
		s6=6;
		sideUp=3;
		
		
	}

	   // classic constructor
	   /*
	   * The purpose of a constructor is to initialize instance fields and class variables.
	   * We can't have objects running around with instance fields and class variables with no values.
	   * We will use this constructor to create Die objects. We will have to send in a char.
	   * Constructors are public, have NO return type (not even void), and are always named the same as the class.
	   */

	
	public InClass6(char type){ //**********IMP example of a constructor folloes this format. 
		if (type == 'A'){
			s1=2;
			s2=2;
			s3=4;
			s4=4;
			s5=9;
			s6=9;
			sideUp=2;
			
		}else if (type == 'B'){
			s1=1;
			s2=1;
			s3=6;
			s4=6;
			s5=8;
			s6=8;
			sideUp=1;
		}else{
			s1=3;
			s2=3;
			s3=5;
			s4=5;
			s5=7;
			s6=7;
			sideUp=3;
		}
		
	}
 	public int roll() {
 	   	int x = rand.nextInt(6) + 1; // 1-6 random int
 	   	if(x==1) {
 	   		sideUp = s1;
 	   		return s1;
 	   	}
 	   	if(x==2) {
 	   		sideUp = s2;
 	   		return s2;
 	   	}
 	   	if(x==3) {
 	   		sideUp = s3;
 	   		return s3;
 	   	}
 	   	if(x==4) {
 	   		sideUp = s4;
 	   		return s4;
 	   	}
 	   	if(x==5) {
 	   		sideUp = s5;
 	   		return s5;
 	   	}

 	 		sideUp = s6;
 	   	return s6;

 	 	}
	public int getSideUp(){ // classic getter method *****************gonna be on midterm
		return sideUp;
	}
	public void setSideUp (int y){ //classic setter method  *****************gonna be on midtern 
		sideUp = y;
	}
	
	//public static void main(String[] args) {

	//}

}
