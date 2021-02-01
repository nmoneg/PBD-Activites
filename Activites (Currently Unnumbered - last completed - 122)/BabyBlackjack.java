import java.util.Random;

public class BabyBlackjack {

    public static void main(String[] args) {
        
        Random x = new Random();
        int p1 = 1 + x.nextInt(10);
        int p2 = 1 + x.nextInt(10);
        int pSum = p1 + p2;
        int d1 = 1 + x.nextInt(10);
        int d2 = 1 + x.nextInt(10);
        int dSum = d1 + d2;

        System.out.println( "Baby Blackjack!\n" );
        System.out.println( "You drew " + p1 + " and " + p2 + "." );
        System.out.println( "Your total is " + pSum + ".\n" );
        System.out.println( "The dealer has " + d1 + " and " + d2 + "." );
        System.out.println( "Dealer's total is " + dSum + ".\n" );

        if ( pSum > dSum ) {
            System.out.println( "YOU WIN!" );
        } else if ( pSum < dSum ) {
            System.out.println( "DEALER WINS!" );
        } else {
            System.out.println( "IT'S A TIE!" );
        }

    }
}