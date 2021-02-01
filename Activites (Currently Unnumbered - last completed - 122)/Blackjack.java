import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        
        Random x = new Random();
        Scanner kb = new Scanner(System.in);

        int p1 = 2 + x.nextInt(10);
        int p2 = 2 + x.nextInt(10);
        int p3;
        int pSum = p1 + p2;
        int d1 = 2 + x.nextInt(10);
        int d2 = 2 + x.nextInt(10);
        int d3;
        int dSum = d1 + d2;

        String game = "running";

        System.out.println( "Welcome to Nikki's Blackjack program!\n" );
        System.out.println( "You drew a " + p1 + " and a " + p2 + "." );
        System.out.println( "Your total is " + pSum + "." );

        if ( pSum > 21 ) {
            game = "over";
        } 

        if ( game.equals( "running" )) {

            System.out.println( "\nThe dealer has a " + d1 + " showing, and a hidden card." );
            System.out.println( "His total is hidden too." );
            System.out.print( "\nWould you like to \"hit\" or \"stay\"? " );
            String deal = kb.nextLine();    

            while ( deal.equals( "hit" ) && game.equals( "running") ) {

                p3 = 2 + x.nextInt(10);
                pSum = pSum + p3;

                System.out.println( "You drew a " + p3 + "." );
                System.out.println( "Your total is " + pSum + "." );

                if ( pSum > 21 ) {
                    game = "over";
                } else {
                    
                    System.out.print( "\nWould you like to \"hit\" or \"stay\"? " );
                    deal = kb.nextLine();
                
                }
            }

            while ( game.equals( "running" ) ) {
                System.out.println( "\nOkay, dealer's turn." );
                System.out.println( "His hidden card was a " + d2 + "." );
                System.out.println( "His total was " + dSum + "." );

                if ( dSum > 21 ) {
                    game = "over";
                }

                while ( dSum <= 16 && game.equals( "running" ) ) {

                    d3 = 2 + x.nextInt(10);
                    dSum = dSum + d3;

                    System.out.println( "\nDealer chooses to hit." );
                    System.out.println( "He draws a " + d3 + "." );
                    System.out.println( "His total is " + dSum + "." );

                    if ( dSum > 21 ) {
                        game = "over";
                    }
                
                }
             
                while ( game.equals( "running" ) ) {
                    System.out.println( "\nDealer stays." );
                    System.out.println( "\nDealer total is " + dSum );
                    System.out.println( "Your total is " + pSum );
                    game = "over";
                }    
            }
        }
        
        if ( pSum <= 21 && pSum > dSum ) {
            System.out.println( "\nYOU WIN!");
        } else if ( pSum > 21 ) {
            System.out.println( "\nBUST!\nDEALER WINS!");
        } else if ( dSum > 21 ) {
            System.out.println( "\nBUST!\nYOU WIN!");
        } else if ( dSum <= 21 && dSum >= pSum ) {
            System.out.println( "\nDEALER WINS!" );
        }
    }
}