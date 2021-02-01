import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte { 
    public static void main ( String[] args ) {

        Scanner keyboard = new Scanner(System.in);
        Random x = new Random();

        System.out.println( "You slide up to Fast Eddie's card table and plop down your cash." );
        System.out.println( "He glances at you out of the corner of his eye and starts shuffling." );
        System.out.println( "He lays down three cards." );
        System.out.println();
        System.out.println( "Which one is the ace?" );
        System.out.println();
        System.out.println( "\t##\t##\t##" );
        System.out.println( "\t##\t##\t##" );
        System.out.println( "\t1\t2\t3" );
        System.out.println();
        System.out.print( "> " );
        int guess = keyboard.nextInt();
        System.out.println();

        int answer = 1 + x.nextInt(3);

        if ( guess == answer ) {
            System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." );
        }
        else {
            System.out.println( "Ha, Fast Eddie wins again! The ace was card number " + answer + "." );
        }

        if ( answer == 1 ) {

            System.out.println();
            System.out.println( "\tAA\t##\t##" );
            System.out.println( "\tAA\t##\t##" );
            System.out.println( "\t1\t2\t3" );
            System.out.println();            

        }
        else if ( answer == 2 ) {

            System.out.println();
            System.out.println( "\t##\tAA\t##" );
            System.out.println( "\t##\tAA\t##" );
            System.out.println( "\t1\t2\t3" );
            System.out.println();            

        }
        else if ( answer == 3 ) {

            System.out.println();
            System.out.println( "\t##\t##\tAA" );
            System.out.println( "\t##\t##\tAA" );
            System.out.println( "\t1\t2\t3" );
            System.out.println();            

        }
    }
}