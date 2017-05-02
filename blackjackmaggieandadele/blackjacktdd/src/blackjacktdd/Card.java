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

	
	//static suits
public final static int					S = 0;
public final static int                	H = 1;
public final static int 				D = 2;
public final static int 				C = 3;
                 

//card has suit, rank, and a number
 private final int suit;
 private final int rank;
 private final int cardNum;

//13 ranks, 4 suits, cardNum 1-11
 public Card(int rank, int suit, int cardNum) {
     this.rank = rank;
     this.suit = suit;
     this.cardNum = cardNum;
 }

 public int getCardNumber() {
     return cardNum;
 }

 public int getSuit() {
     return suit;
 }

 public int getRank() {
     return rank;
 }

//suit as String
 
 
 public String getSuitAsString() {
     switch ( suit ) {
        case S:  		 return "Spade";
        case H:   		return "Heart";
        case D: 		return "Diamond";
        case C:   		 return "Club";
        default:    	   return "?";
     }
 }

 //Rank as String
 
 public String getValueAsString() {
     switch (rank) {
        case 1:   return "Ace";
        case 2:   return "2";
        case 3:   return "3";
        case 4:   return "4";
        case 5:   return "5";
        case 6:   return "6";
        case 7:   return "7";
        case 8:   return "8";
        case 9:   return "9";
        case 10:  return "10";
        case 11:  return "Jack";
        case 12:  return "Queen";
        case 13:  return "King";
        default:  return "??";
     }
 }
 
 //to see a card
 public String toString() {
     return "[" + getValueAsString() + " of " + getSuitAsString() + "]";
 }


}
