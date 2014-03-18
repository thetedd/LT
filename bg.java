import java.io.*;
import java.util.*;

class Launcher {
	public static void main(String[] args) {
	System.out.println("Welcome to Love Triangle!");
	BufferedReader reader;
	reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Please enter your name: ");
	String name = "";
	try{
	name = reader.readLine();
	}
	catch (IOException ioe){;
	}
	System.out.println("Hi " + name+"!");
	}
	
}
class Player {
	int Ht = 0; //this will be attr 0
	int Cf = 0; //this will be attr 1
	int It = 0; //this will be attr 2
	ArrayList<Integer> low = new ArrayList<Integer>(3); //this will be lvl 0
		low.add(2);
		low.add(3);
		low.add(4);
	ArrayList<Integer> high = new ArrayList<Integer>(5); //this will lvl 1
		high.add(3);
		high.add(4);high
		high.add(5);high
		high.add(6);
		high.add(7);
	ArrayList<Card> hand = new ArrayList<Card>(); //hand
	ArrayList<Card> maindeck = new ArrayList<Card>(); //maindeck
	ArrayList<Card> randomdeck = new ArrayList<Card>();  //randomdeck
	void shufflecards(ArrayList<Card> cards) {
		Collections.shuffle(cards);
	}
	void drawcard(ArrayList<Card> hand, ArrayList<Card> deck) {
		if (!deck.isEmpty()) {
		Card drawn = deck.remove(0);
		hand.add(drawn);
		}
	}
	void plusplus(int attr){
		Collections.shuffle(high);
		alterattr(high.get(0), attr, true);
	}
	void minusminus(int attr){
		Collections.shuffle(high);
		alterattr(high.get(0), attr, false);
	}
	void plus(int attr){
		Collections.shuffle(low);
	}
	void alterattr(int spin, int attr, boolean plus){
		int test = 0;
		if (plus) {
		if (attr == 0) {
			test = Ht + spin;
			if (test>10) {
				Ht = 10;
			} else {
				Ht = test;
			}
		}
		if (attr == 1) {
			test = Cf + spin;
			if (test>10) {
				Cf = 10;
			} else {
				Cf = test;
			}
		}
		if (attr == 2) {
			test = It + spin;
			if (test>10) {
				It = 10;
			} else {
				It = test;
			}
		}
		} else {
			if (attr == 0) {
			test = Ht - spin;
			if (test<0) {
				Ht = 0;
			} else {
				Ht = test;
			}
		}
		if (attr == 1) {
			test = Cf + spin;
			if (test<0) {
				Cf = 0;
			} else {
				Cf = test;
			}
		}
		if (attr == 2) {
			test = It + spin;
			if (test<0) {
				It = 0;
			} else {
				It = test;
			}
		}
		}
	}

}
class Card {
	String type = "";
	String name = "";
	String character = "";
	String description = "";
}

