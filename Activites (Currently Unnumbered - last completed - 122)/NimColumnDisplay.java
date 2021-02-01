import java.util.Scanner;

public class NimColumnDisplay {

    public static void main(String[] args) {
        
        Scanner keyboard =  new Scanner(System.in);

        int a = 3;
        int b = 4;
        int c = 5;
        String pile = "";
        int remove;
        int sum;
        String player = "";
        int n = 1;
        int x;
        int y;
        int z;

        System.out.print( "Player 1, enter your name: " );
        String p1 = keyboard.next();
        System.out.print( "Player 2, enter your name: " );
        String p2 = keyboard.next();

        x = a;
        y = b;
        z = c;

        while ( x != 0 ) {
            System.out.print( "\n\t*" );
            x--;
        }

        while ( y != 0 ) {
            System.out.print( "\n\t  *" );
            y--;
        }

        while ( z != 0 ) {
            System.out.print( "\n\t   *" );
            z--;
        }

        System.out.println( "\n\tA B C" );

        while ( (a > 0)|| (b > 0) || (c > 0) ) {

            if ( n%2 != 0 ) {
                player = p1;
            } else {
                player = p2;
            }

            System.out.print( "\n\n" + player + ", choose a pile: " );
            pile = keyboard.next();

            while ( (pile.equals( "A" ) && a <= 0 ) || (pile.equals( "B" ) && b <= 0 ) || (pile.equals( "C" ) && c <= 0 ) ) {
                
                System.out.print( "\nNice try, " + player + ". That pile is empty. Choose again: " );
                pile = keyboard.next();
                
            }

            System.out.print( "How many to remove from pile " + pile + ": " );
            remove = keyboard.nextInt();

            while ( remove <= 0 ) {
                System.out.print( "\nYou must choose at least 1. How many? " );
                remove = keyboard.nextInt();
            }

            while ( (pile.equals( "A" ) && remove > a ) || (pile.equals( "B" ) && remove > b ) || (pile.equals( "C" ) && remove > c ) ) {
                System.out.print( "\nPile " + pile + " doesn't have that many. Try again: " );
                remove = keyboard.nextInt();
            }

            while ( remove <= 0 ) {
                System.out.print( "\nYou must choose at least 1. How many? " );
                remove = keyboard.nextInt();
            }
            
            if ( pile.equals( "A" )) {
                sum = a - remove;
                a = sum;
            } else if ( pile.equals( "B" )) {
                sum = b - remove;
                b = sum;     
            } else if ( pile.equals( "C" )) {
                sum = c - remove;
                c = sum;
            }

            x = 0;
            y = 0;
            z = 0;

            System.out.print( "\nA: " );

            while ( x < a ) {
                System.out.print( "*" );
                x++;
            }
            
            System.out.print( "\nB: " );

            while ( y < b ) {
                System.out.print( "*" );
                y++;
            }

            System.out.print( "\nC: " );

            while ( z < c ) {
                System.out.print( "*" );
                z++;
            }

            if  ((a + b + c) == 1 ) {
                break;                
            }

            n++;
        }

        if ( (player.equals(p1)) && ((a + b + c) == 0) ) {
            System.out.println( "\n\n" + p2 + ", there are no counters left, so you WIN!" );

        } else if ( (player.equals(p2)) && ((a + b + c) == 0) ) {
            System.out.println( "\n\n" + p1 + ", there are no counters left, so you WIN!" );

        } else if ( (player.equals(p1)) && ((a + b + c) == 1) ) {
            System.out.println( "\n\n" + p2 + ", you must take the last remaining counter, so you lose. " + p1 + " wins!" );

        } else if ( (player.equals(p2)) && ((a + b + c) == 1) ) {
            System.out.println( "\n\n" + p1 + ", you must take the last remaining counter, so you lose. " + p2 + " wins!" );

        keyboard.close();
        }
    }


}