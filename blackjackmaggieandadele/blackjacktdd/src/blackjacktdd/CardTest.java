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
	 * started with basic card and cardDeck class, and went from there..
	 */
	@Test
	public void testDeckOfCards()
	{
		String result = "1Deck contains " + test_deck.sizeOfDeck();
		assertEquals(result, 52, test_deck.sizeOfDeck());
		System.out.println(result);
	}
	
	/**Test to confirm numerical value of a card*/
	
	   @Test
	    public void getCardValue() {
		   Card testcard = new Card(0, 0, 1); //put it one for value
		   String result = "2This card is a :" + testcard.getCardNumber(); //1 is expected value of card
	        assertEquals(result, 1, testcard.getCardNumber());
	    	System.out.println(result);
	    }
	   
	   @Test
	    public void get10CardValue() {
		   Card testcard = new Card(0, 0, 10); //put in ten for value
		   String result = "This card is a :" + testcard.getCardNumber(); //10 is expected value of card
	        assertEquals(result, 10, testcard.getCardNumber());
	    	System.out.println(result);
	    }
	/**Test to check the rank of a card**/
	   
	    @Test
	    public void getCardRank() {
	 
	        Card testcard = new Card(1, 0, 1);       //rank = 1, suit, value = 1
	        String result = "This card is ranked a :" + testcard.getRank();
	        assertEquals(1, testcard.getRank());
	        System.out.println(result);
	    }
	    
	    @Test
	    public void getFaceCardRank() {
	   	 
	        Card testcard = new Card(11, 0, 10);       //rank = 11, suit, value = 10
	        String result = "This card is ranked a :" + testcard.getRank(); //11 is expected
	        assertEquals(11, testcard.getRank());
	        System.out.println(result);
	    }
	
	    @Test
	    public void checkifFaceCard() {
	   	 
	        Card testcard = new Card(11, 0, 10);       //rank = 11, suit, value = 10
	        String result = "FaceCard?:" + test_deck.checkFaceCards(11); //11 is expected
	        assertEquals(true, test_deck.checkFaceCards(11));
	        System.out.println(result);
	    }
	
	
	
	
	//    @Test
    public void dealCardtoHandTest() {
	  

	       assertEquals();
	   }
	
	
	
	
	
	/*Test to deal deck until 0 cards*/
	    @Test
	    public void dealCardsUntilEmpty() {
	        for(int i = 0; i < test_deck.sizeOfDeck(); i++) {
	            test_deck.dealCard();
	        }

	        assertEquals(0, test_deck.cardsLeft());
	    }
	
	    @Test
	    public void deal10CardsTest() {			//deal 10 cards
	        for(int i = 0; i < 10; i++) {
	            test_deck.dealCard();
	        }

	        assertEquals(42, test_deck.cardsLeft());		//42 cards let
	    }
	/**Test to confirm hand is under 21*/
	
	/*Test to confirm a hand is over 21*/
	
	/*test to confirm bank has over 20*/
}
