/**
 * 
 */
package blackjacktdd;
/**
 * 
 * @author SKYFALL (Adele Francois)
 * @author Maggie Muse
 * @collborativeauthor John Rose
 */

public class Card {
 
	private int card_number_value;
	private Suit card_suit;
	/**
	 * 
	 * Card constructor
	 * @param input_suit       suit of the card
	 * @param input_number_value  number value of the card
	 */
	
	public Card(Suit input_suit, int input_number_value)
	{
		this.card_suit= input_suit;
		this.card_number_value = input_number_value;
	}
	/**
	 * 
	 * @return number value of a card
	 */
	
	public int getNumberValue() 
	{
	return card_number_value;
	
}
	public String toString()
	{
		String numStr = null;
		switch (this.card_number_value)
		{
		case 1:
			numStr = "Ace";
			break;
			
		case 2:
			numStr = "Two";
			break;
			
		case 3:
			numStr="Three";
			break;
		
		case 4:
		numStr="Four";
		break;
		
		case 5:
			numStr="Five";
			break;
			
		case 6:
			numStr="Six";
			break;
		
		case 7:
			numStr="Seven";
			break;
			
		case 8:
			numStr="Eight";
			break;
			
		case 9:
			numStr="Nine";
			break;
			
		case 10:
			numStr="Ten";
			break;
			
		case 11:
			numStr="Jack";
			break;
			
		case 12:
			numStr="Queen";
			break;
		
		case 13:
			numStr="King";
			break;
		
	}
		return numStr + "of" + card_suit.toString();
}
}