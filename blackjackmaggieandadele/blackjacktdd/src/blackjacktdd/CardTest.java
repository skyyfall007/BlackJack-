/**
 * 
 */
package blackjacktdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*@author SKYFALL (Adele Francois)
 * @author Maggie Muse
 * @collborativeaid John Rose
 */

public class CardTest 
{
	private CardDeck test_deck;
	
	@Before
	public void setup()
	{
		test_deck= new CardDeck();
	}
	/**
	 * Test to confirm that deck has 52 cards
	 */
	@Test
	
	public void testDeckOfCards()
	{
		assertEquals(52, test_deck.sizeOfDeck());
	}
}
