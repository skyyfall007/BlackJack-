package blackjacktdd;

import java.util.ArrayList;
import java.util.List;

public class Player {


	    private List<Card> hand; //player has a hand

	   
	    public Player() {
	        hand = new ArrayList<>();
	    }

	    //Deal a card to players hand
	    public void dealToHand(Card handcard) {
	        hand.add(handcard);
	    }

	    //get hand
	    public List<Card> getHand() {
	        return hand;
	    }
	    
	    
	    //so player can see their hand
	    public String getPlayingHand() {
	        StringBuilder string = new StringBuilder();
	        if(validHand()) {
	            for (Card c : hand) {
	                string.append(c.toString());
	                string.append(", ");
	            }
	        }
	        return string.length() > 0 ? string.substring(0, string.length() - 2): "";
	    }

	
	    public String showFirstCard() {
	        String cardName = "";
	        if(validHand()) cardName = hand.get(0).toString();
	        return cardName;
	    }

	    public Card getFirstCard() {
	        Card firstCard = null;

	        if(validHand()) firstCard = hand.get(0);
	        return firstCard;
	    }

	//is this hand valid
	    private boolean validHand() {
	        if(!hand.isEmpty() && hand != null) return true;
	        return false;
	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    /**
	     * Checks for total hand value
	     * If value is above 21 and contains an Ace card, set cardValue of Ace card to 1
	     * @return int
	     */
	    public int getHandValue() {
	        int value = 0;
	        for(Card c : hand) {
	            value += c.getCardNumber();
	        }

	        // Sets total hand value to (value - 10) if value is equal to 21 or
	        // lower and keeps doing so depending on count value from aceInHand()
	        if(value > 21 && aceInHand() >= 1) {
	            for(int i = 0; i < aceInHand(); i++) {
	                value = value - 10;
	                if(value <= 21) {
	                    break;
	                }
	            }
	        }

	        return value;
	    }

	    /**
	     * Checks hand for Ace card(s)
	     * @return int
	     */
	    private int aceInHand() {
	        int count = 0;
	        for(Card c : hand) {
	            if(c.getRank() == 1) {
	                count++ ;
	            }
	        }
	        return count;
	    }

	    /**
	     * Method returns size of hand
	     * @return int size
	     */
	    public int getHandSize() {
	        return hand.size();
	    }

	    /**
	     * Method removes all element from player's hand
	     */
	    public void clearHand() {
	        hand.clear();
	    }

	} // end class Player

