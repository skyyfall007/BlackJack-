package blackjacktdd;
import java.util.Scanner;

public class Dealer {

    private static Scanner scanner = new Scanner(System.in);
    private Player player, dealer;
    private CardDeck deck;

    public static void main(String[] args) {
        new Dealer().DealerStart();
    }

 //start a game
    public void DealerStart() {

        player = new Player();  // Player
        dealer = new Player();  // Dealer

        deck = new CardDeck();      //deck of cards

        int money;          // Amount of money the user has.
        int bet;            // Amount user bets on a game.
        boolean userWins;   // how to win

        System.out.println("Welcome to BlackJack.");
        System.out.println();

        money = 1000;  //Player starts with $1000 in bank.

        while (true) {
            System.out.println("You have " + money + " dollars.");

            do {
                System.out.println("How many dollars do you want to bet?  (Enter 0 to end.)");
                System.out.print("You bet: $");
                bet = scanner.nextInt();
                if (bet < 0 || bet > money) {
                    System.out.println("Your answer must be between 0 and " + money + '.');
                }
            } while (bet < 0 || bet > money);
            if (bet == 0) {
                break;
            }

            userWins = playBlackJack();

            if (userWins) {
                money = money + bet;
            }
            else {
                money = money - bet;
            }
            System.out.println();
            if (money == 0) {
                System.out.println("Looks like you've are out of money!");
                break;
            }
        }

        System.out.println();
        System.out.println("You leave with $" + money + '.');

    } // end main()


    private boolean playBlackJack() {

       //clear the hands
        player.clearHand();
        dealer.clearHand();

        deck.shuffle(); // Shuffle deck

        player.dealToHand(deck.dealCard());  //Adds one card from deck to player's hand
        player.dealToHand(deck.dealCard());		//Adds second cards
        dealer.dealToHand(deck.dealCard());  //Adds one card from deck to dealer's hand
        dealer.dealToHand(deck.dealCard());	//Adds second card

        System.out.println();
        System.out.println();

     //Check to see if you have 21; if you have blackJack, you win
     //dealer wins ties

        if (dealer.getHandValue() == 21) {
            System.out.println("Dealer has the " + dealer.getPlayingHand() + ".");
            System.out.println("Player has the " + player.getPlayingHand() + ".");
            System.out.println();
            System.out.println("Dealer has Blackjack.  Dealer wins.");
            return false;
        }

        if (player.getHandValue() == 21) {
            System.out.println("Dealer has the " + dealer.getPlayingHand() + ".");
            System.out.println("Player has the " + player.getPlayingHand() + ".");
            System.out.println();
            System.out.println("You have Blackjack.  You win.");
            return true;
        }

       //if neither plyer nor dealer has blackjack, continue playing...

        while (true) {

       //show cards

            System.out.println();
            System.out.println();
            System.out.println("Your cards are: " + player.getPlayingHand());
            System.out.println("Your total value: " + player.getHandValue());
            System.out.println();
            System.out.println("Dealer is showing the " + dealer.showFirstCard());
            System.out.println();
            System.out.println("Do you want to Hit (H) or Stand (S)?");
            char userAction;  // Player's response, 'H' or 'S'.
            do {
                userAction = Character.toUpperCase(scanner.next().charAt(0));
                if (userAction != 'H' && userAction != 'S') {
                    System.out.print("Please respond H or S:  ");
                }
            } while (userAction != 'H' && userAction != 'S'); //fix incorrect input just in case

           //if player hits, they get a card
            //if they stay, no card

            if (userAction == 'S') {
                // Loop ends
                break;
            } else {
                // Hit
                // Give the user a card.  If the user goes over 21, the user loses.
                Card newCard = deck.dealCard();
                player.dealToHand(newCard);
                System.out.println();
                System.out.println("User hits.");
                if (player.getHandValue() > 21) {
                    System.out.println();
                    System.out.println("Your cards are: " + player.getPlayingHand());
                    System.out.println("Your total value: " + player.getHandValue());
                    System.out.println();
                    System.out.println("You busted by going over 21. You lose.");
                    System.out.println("Dealer's other card are: " + dealer.getPlayingHand());
                    return false;
                }
            }

        } 

       //Player chose to stay and has not busted yet, Now its the dealers turn....

        System.out.println();
        System.out.println("User stands.");
        System.out.println("Dealer's cards are: " + dealer.getPlayingHand());
        while (dealer.getHandValue() <= 16) {
            Card newCard = deck.dealCard();
            System.out.println("Dealer hits and gets the: " + newCard.toString());
            dealer.dealToHand(newCard);
        }
        System.out.println("Dealer's total is: " + dealer.getHandValue());

        //Declare Winner

        System.out.println();
        if (dealer.getHandValue() > 21) {
            System.out.println("Dealer busted by going over 21. You win.");
            return true;
        } else {
            if (dealer.getHandValue() == player.getHandValue()) {
                System.out.println("Dealer wins on a tie. You lose.");
                return false;
            } else {
                if (dealer.getHandValue() > player.getHandValue()) {
                    System.out.println("Dealer wins, " + dealer.getHandValue() + " points to " + player.getHandValue());
                    return false;
                } else {
                    System.out.println("You win, " + player.getHandValue() + " points to " + dealer.getHandValue());
                    return true;
                }
            }
        }

    }  

}  
