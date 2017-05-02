/**
 * 
 */
package blackjacktdd;

/**
 * 
 * @author SKYFALL (Adele Francois)
 * @author Maggie Muse
 * @collborativeaid John Rose
 */
public class CardDeck
{
	
	
    private Card[] deck;
    private int cardsDelt;
    
    
	   public CardDeck() {
	        deck = new Card[52];
	        int cardCount = 0; // How many cards have been created so far.
	        int cardValue = 0;
	        for ( int suit = 0; suit <= 3; suit++ ) {
	            for ( int value = 1; value <= 13; value++ ) {
	            	
	                //If it is a face card (J, Q, K) set cardValue to 10
	                if(checkFaceCards(value)) {
	                    cardValue = 10;
	                }
	                else {
	                    cardValue = value;
	                }

	                if(value == 1) {
	                    cardValue = 11;
	                }

	                deck[cardCount] = new Card(value, suit, cardValue);
	                cardCount++;
	            }
	        }
	        cardsDelt = 0;
	    }

	    public int sizeOfDeck() {
	        return deck.length;
	    }

	    //Checks for face card (Ace, Jack, Queen, and King)
	     
	    boolean checkFaceCards(int cardIndex) {
	        switch(cardIndex) {
	            case 11: return true; //Jack
	            case 12: return true; //Queen
	            case 13: return true; //King
	            default: return false; //handleAcelater
	        }
	    }

	    //shuffle remaining cards
	    public void shuffle() {
	        for ( int i = deck.length-1; i > 0; i-- ) {
	            int rand = (int)(Math.random()*(i+1));
	            Card temp = deck[i];
	            deck[i] = deck[rand];
	            deck[rand] = temp;
	        }
	        cardsDelt = 0;
	    }

	    //take cards out of deck when dealing, how many are left
	    public int cardsLeft() {
	        return deck.length - cardsDelt;
	    }

	  //deal one card
	    public Card dealCard() {
	        if (cardsDelt == deck.length)
	            throw new IndexOutOfBoundsException("No cards are left in the deck.");
	        cardsDelt++;
	        return deck[cardsDelt - 1];
	    }

	} 
//	public Card DealCard()
//	{	//int deckstack = sizeOfDeck();
		//if(deckstack != 0)
	//	{ for(int i=0; i>52; i++)
	//		{
	//		System.out.print(deck[0]);
	//		return deck[i];}
	//	}
	//	return null;
	//}

//}

