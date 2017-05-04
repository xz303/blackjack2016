
public class BlackJackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck d = new Deck();
		Hand ch = new Hand();
		Hand hh= new Hand();
	
		Game g = new Game(d, hh, ch);
		
		g.playGame();

	}

}
