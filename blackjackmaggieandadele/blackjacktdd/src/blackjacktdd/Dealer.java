package blackjacktdd;

public class Dealer extends CardDeck {

	public Card [] newDeck;
	int deckstack = sizeOfDeck();

	
public Card[] shuffle()
{
	if (deckstack != 0)
	{
		System.out.println("deck is not empty");
	}
	return newDeck;		
}


public Card DealCard()
{
	
	if(deckstack != 0)
	{
		return this.newDeck[0];
	}
	return null;
}

	
}