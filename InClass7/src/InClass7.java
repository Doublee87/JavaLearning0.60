import java.awt.Color;


public class InClass7 { // Card
	private int value;
	private String suit;
	private boolean faceUp;
	private static Color back; // static because all cards all the same color
	
	public InClass7 (int x){
		faceUp = false;
		back = Color.red;
		int y = x/13;
		if (y==0){
			suit = "Hearts";
		}else if (y==1){
			suit = "Clubs";
		}else if (y==2){
			suit = "Dimonde";
		}
		else {
			suit="Spades";
		}
		value = x%13 +1;
			
		}
	public String getSuit(){
		return suit;
		
	}
	public void setFaceUp (boolean b){
		faceUp = b;
	}
	public int getVlaue(){
		return value;
		
	}

}
