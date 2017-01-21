/**
 * This is a class to build a card.
 * @author zhangxiang
 *
 */
public class Card {
	/**
	 * instance variable of rank and suit, both are integers.
	 */
	private int rank;
	private int suit;

	/**
	 * a single card should have a rank and a suit.
	 * @param rank
	 * @param suit
	 */
	public Card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}
	/**
	 * face value is a string value, this method is to 
	 * pair rank(integer value) with face(String).
	 * @return
	 */
	
	public String getFace(){
		
		String face="";
		
		if(rank == 1){
			face = "Ace";
		}else if (rank == 2){
			face = "Two";
		}else if (rank == 3){
			face = "Three";
		}else if (rank == 4){
			face = "Four";
		}else if (rank == 5){
			face = "Five";
		}else if (rank == 6){
			face = "Six";
		}else if (rank == 7){
			face = "Seven";
		}else if (rank == 8){
			face = "Eight";
		}else if (rank == 9){
			face = "Nine";
		}else if (rank == 10){
			face = "Ten";
		}else if (rank == 11){
			face = "Jack";
		}else if (rank == 12){
			face = "Queen";
		}else if (rank == 13){
			face = "King";
		}
		return face;
	}
	
	/**
	 * color is also a string value, this method is to 
	 * convert suit(integer) to color(string).
	 * @return
	 */
	public String getColor(){
		
		String color = "";
		
		if (suit == 1){
			color = "Spades";
		}else if (suit == 2){
			color = "Hearts";
		}else if (suit == 3){
			color = "Clubs";
		}else if (suit == 4){
			color = "Dimonds";
		}
			
		return color;
	}
	/**
	 * A getter method to get the value of rank.
	 * @return
	 */
	public int getRank(){
		return rank;
	}
	
	public int getValue(){
	
		int value = 0;
		if (getFace() == "Ace"){
			value = 1;
		}else if(getFace() == "Two"){
			value = 2;
		}else if(getFace() == "Three"){
			value = 3;
		}else if(getFace() == "Four"){
			value = 4;
		}else if(getFace() == "Five"){
			value = 5;
		}else if(getFace() == "Six"){
			value = 6;
		}else if(getFace() == "Seven"){
			value = 7;
		}else if(getFace() == "Eight"){
			value = 8;
		}else if(getFace() == "Nine"){
			value = 9;
		}else if(getFace() == "Ten"){
			value = 10;
		}else if(getFace() == "Jack"){
			value = 10;
		}else if(getFace() == "Queen"){
			value = 10;
		}else if(getFace() == "King"){
			value = 10;
		}
		
		return value;
		
	}
    
	}
