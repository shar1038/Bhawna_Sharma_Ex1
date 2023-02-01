package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * @author dancye
 * @Paul Bonenfant Jan 25, 2023
 * @author Bhawna Sharma Feb 1, 2023

 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner cs = new Scanner(System.in);
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*13 + 1));
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            System.out.println(card.getValue()+ " " + card.getSuit());
            
            System.out.println("Enter the card number (1-13)");
            int cardnumber = new Scanner(System.in).nextInt();
            System.out.println("Choose Card-Suit [1.Heats , 2.Diamonds , 3.Spades,4.Clubs");
            int suit = new Scanner(System.in).nextInt();
            
            Card MagicCard = new Card();
            
            MagicCard.setValue(cardnumber);
            MagicCard.setSuit(Card.SUITS[suit-1]);
            
            
            if(MagicCard.getValue()==card.getValue() && MagicCard.getSuit()==card.getSuit()){
                printInfo();
                break;
            }
            else{
                System.out.println("You picked wrong card :(");
            }
        }  
    }

      
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        
         System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
