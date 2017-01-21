import java.util.ArrayList; 

public class Hand {
	
	
	
	// private int index = 0;
	
	ArrayList<Card> hand;
	
	// private int scoreInHand;
	private int numberOfAces;
	
	public Hand(){
		
		hand = new ArrayList<Card>();
		
	}
	
	public void addCard(Card card){

//		Card c = d.drawCard();
		hand.add(card);
		if(card.getRank() == 1){
			numberOfAces++;
		}
		
	}
	
	public int calculateScore(){
		int scoreInHand = 0;
		// int total = 0;
		for(int i = 0; i<hand.size(); i++){
			scoreInHand += hand.get(i).getValue(); 	
		}
		
		if(numberOfAces == 0){
			scoreInHand = scoreInHand;
		}else{
			if(scoreInHand + 10 < 21){
				scoreInHand = scoreInHand + 10;
			}
		}
		return scoreInHand;
		
	}
	
/**
 * display a card from hand.
 * @return
 */
	
public Card aCard(int t){
	
	System.out.println(hand.get(t-1));
	return hand.get(t-1);
	
	
	
}



	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	        
	       
	}
	


