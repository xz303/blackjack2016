import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	Deck testDeck = new Deck();
	@Test
	public void testDeck() {
		assertFalse(testDeck.getdeck().size()==0);
	}

	@Test
	public void testCreateDeck() {
		
	}

	@Test
	public void testDrawCard() {
		Card card = testDeck.drawCard();
		assertTrue(1<=card.getRank()&&card.getRank()<=13);
	}

	@Test
	public void testGetDeck() {
		
	}

	@Test
	public void testSetDeck() {
		
	}

}
