import java.util.ArrayList;

import java.util.Random;

public class Deck {

	/**
	 * create a ArrayList of card.
	 */
	private ArrayList<Card> deck;


	/**
	 * Build a constructor, every time Deck is called, it will create a new deck of cards.
	 * @return 
	 */
	public Deck(){

		deck = new ArrayList<Card>();
		createDeck();


	}
	
	public ArrayList<Card> getdeck(){
		return deck;
	}

	public void createDeck() 	{
		for(int m = 1; m<5; m++){

			for (int n = 1; n<14; n++){
				Card c = new Card(n, m);
				deck.add(c);

			}
		}
	}


			/**
			 * This method will shuffle a deck.
			 */
		//	public void shuffle(){

			// ArrayList<Card> tempDeck = new ArrayList<Card>();
			// 	Random rand = new Random();
			//	int randIndex = rand.nextInt(deck.size());

			//	for(int j = 0; j< deck.size();j++ ){

				//	tempDeck.add(deck.get(randIndex));

				//	deck.remove(randIndex);
				//}

				//deck = tempDeck;

			// }

			//  public void removeCard(int i){
			// 	 deck.remove(i);
			//  }

			//  public Card getCard(int i){

			//	 return deck.get(i);

			//  }

			// public void addCard(Card newCard){
			// deck.add(newCard);

			// }

			/**
			 * This method is to get a card from the deck and
			 * remove this card from the deck at the same time.     
			 */
			public Card drawCard(){

				Card Carddrawn;
				Random rand = new Random();
				//System.out.println(deck.size());
				int index =rand.nextInt(deck.size());


				Carddrawn = deck.get(index); 
				deck.remove(index); 

				return Carddrawn;     



			}


			//  public void draw (Deck fromWhich) {

			//	 deck.add(fromWhich.getCard(0));
			//	 fromWhich.removeCard(0);

			//  }

		

	

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}











}
