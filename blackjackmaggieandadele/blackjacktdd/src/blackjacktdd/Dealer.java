package blackjacktdd;

import java.util.Scanner;

public class Dealer {
	
	 private static Scanner scanner = new Scanner(System.in); //to tell dealer hit or stay or bet
	 private Player player, dealer; //need two players
	 private CardDeck deck; //and a deck
	    
public void DealerStart(){

	        player = new Player();  // Player
	        dealer = new Player();  // Dealer

	        deck = new CardDeck();      // Initialized new Deck of cards


	        System.out.println("Welcome to the game of BlackJack.");
	        System.out.println();
	        
	        
public CardDeck shuffle()
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
	{ for(int i=0; i>52; i++)
	//	{return newDeck[i];}
		;
	}
	return null;
}


public void hit()
{
	if(turn == "H")
	{
		DealCard();
	}
	
	else if (turn == "S")
	{
		System.out.println("You have chosen not to hit.");
	}
		
	}

public static void main(String[] args)
{	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to Muse/Francois BlackJack Game written with TDD!");
	initial_deck = new CardDeck();
	initial_deck.DealCard();
	
}
	
}
