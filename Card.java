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
	
	public Card(Suit input_suit, int input_number_value)
	{
		this.card_suit= input_suit;
		this.card_number_value = input_number_value;
	}
	
}
