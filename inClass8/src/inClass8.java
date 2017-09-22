import java.util.Scanner;


public class inClass8 {
	public static void main (String []args){
	//int x=1, testScore=0;
	//double sum = 0;
	//Scanner reader = new Scanner (System.in);
	int [] myArray = {23,56,82,13,90};
	String [] words= {"dpg", "cat","bird"};
	Boolean b = false;
	boolean bb = false;
	String str = "14";
	int myInt = Integer.parseInt(str);
	
	for (String s:words){
		System.out.println(s);
	}
	int max =Integer.MIN_VALUE;
	for (int z : myArray){
		if (z>max)
			max=z;
	}
	}
}
