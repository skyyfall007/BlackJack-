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
	private Card [] deck;
	
	public CardDeck()
	{
		deck= new Card [52];
		int card_index=0;
		
		//Creates for loop for each suit of card
		for (int s=0; s < 4; s++)
		{
			//Creates for loop for each number of card
			for (int n=1; n<14; n++)
			{
				deck[card_index]= new Card(Suit.values()[s],n);
				card_index++;
			} //Closes number of cards for loop
		}//Closes suit of card for loop
	}
	public int sizeOfDeck()
	{
		return deck.length;
	}
}

