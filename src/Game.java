import java.util.Scanner;

public class Game {
	
	Deck playingDeck;
	Hand playerHand;
	Hand computerHand;
	int currentComputerScore;
	
	public Game(Deck d, Hand p, Hand c){
		playingDeck = d;
		playerHand = p;
		computerHand = c;
		
	}
	
	//player get two cards;
	
	public void playGame(){
		
		issueTwoCards();
		
		int humanScore = playerPlay();
		int computerScore = computerPlay();
		
	//	playerPlay();
	//	computerPlay();
		
		
		if(humanScore < computerScore && computerScore <= 21){
			//computer wins
			System.out.println("Player loses the game!");
			
			
		}else if (computerScore<humanScore && humanScore <= 21){
			
			System.out.println("Player wins the game!");
			
			//Human wins
		}else if(humanScore == computerScore){
			
			System.out.println("You got a tie.");
			
		}
	
	
}
	
	
	
	public int playerPlay(){
		
		int playerScore = 0;
		
		playerHand.addCard(playingDeck.drawCard());
		
		//Show card to the player
		System.out.println("The first card player got is "+ playerHand.hand.get(0).getFace() +" "+ playerHand.hand.get(0).getColor() );
		
		playerHand.addCard(playingDeck.drawCard());
		//Show card to the player
		System.out.println("The second card player got is "+ playerHand.hand.get(1).getFace() +" "+ playerHand.hand.get(1).getColor() );

	
		
		//Show current total score in hand to player
		playerScore = playerHand.calculateScore();
		
		System.out.println("The total score of player in hand is  " + playerScore);
		
		if(playerScore > 21){
			System.out.println("Player loses the game.");
			System.exit(0); 
		}
		
		do
		{System.out.println("Do you want to hit or stand? Enter h if hit and s if stand. ");
		Scanner in = new Scanner(System.in);
		
		String answer = in.nextLine();
		if( answer.equalsIgnoreCase("h")){
			Card card = playingDeck.drawCard();
			playerHand.addCard(card);
			System.out.println("The card you got is "+ card.getFace() +" "+ card.getColor() );
			playerScore =playerHand.calculateScore();
			System.out.println("The total score of player in hand is  " + playerScore);
			if(playerScore > 21){
				System.out.println("Player loses the game!");
				System.exit(0);
			
			}
			
		}else if(answer.equalsIgnoreCase("s")){
			System.out.println("It is computer's turn.");
			System.out.println("Computer is now getting cards...");
			computerPlay();
			break;
			
			
		}
		
		}while(playerScore<= 21);
			
		
		return playerScore;
		
	}
	
	
	public int computerPlay(){
		
		
		int computerScore = currentComputerScore;
		
		// while (computerScore <= 17){
			
		// 	Card c1 = playingDeck.drawCard();
		//	computerHand.addCard(c1);
			
		//	computerScore = computerScore + computerHand.calculateScore();
			
		//	if(computerScore > 17 && computerScore <= 21){
		//		System.out.println("The final score of computer is: "+ computerScore);
		//	    break;
			    
		//	}else if (computerScore > 21){
				
		//		System.out.println("Player wins the game!");
				
		//		System.exit(0); 
			
		//	}
		
	//	break;
			
			
	//	}
		
		
		do{
			
	   Card c1 = playingDeck.drawCard();
		computerHand.addCard(c1);
		//Show faceup
	//System.out.println("The card computer got is "+ c1.getFace() +" "+c1.getColor() );
		
		computerScore = computerScore + computerHand.calculateScore();
		//int count = 0;
	 if (computerScore >= 17 && computerScore <= 21){
		System.out.println("The final score of computer is: "+ computerScore);
			break;
			
	
		}else if(computerScore >21){
			System.out.println("Player wins the game!");
			System.exit(0); 
			}
	 
	    break;
		
	  }while(computerScore < 17);
		// System.out.println(computerHand.calculateScore());
	if(computerScore<=21 && computerScore > 17){
		return computerScore;
			
	}else if(computerScore >21){
		System.out.println("Player wins the game!");
		System.exit(0); 
		}
		
		return computerScore;
		
	}	
		

	public int issueTwoCards(){
		Card c2 = playingDeck.drawCard();
		Card c3 = playingDeck.drawCard();
		
		computerHand.addCard(c2);
		computerHand.addCard(c3);
		
		int currentComputerScore = c2.getValue()+c3.getValue();
		
		Card c4 = computerHand.aCard(1);
		
		System.out.println("One of the two cards Computer got is a "+ c4.getFace() +" "+ c4.getColor() );
	    
		return currentComputerScore;
	}
	
	
		

	}
	
	

 	

		
	
