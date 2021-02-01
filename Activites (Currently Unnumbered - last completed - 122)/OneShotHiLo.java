import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo { 
    public static void main ( String[] args ) {

        Scanner keyboard = new Scanner(System.in);
        Random x = new Random();

        System.out.println( "I'm thinking of a number between 1-100. Try to guess it." );
        System.out.print( "> " );             
        int guess = keyboard.nextInt();
        System.out.println();

        int answer = 1 + x.nextInt(100);

        if ( guess == answer ) {
            System.out.println( "You guessed it! What are the odds?!?" );
        }
        else if ( guess < answer ) {
            System.out.println( "Sorry, you are too low. I was thinking of " + answer + "." );
        }
        else if ( guess > answer ) {
            System.out.println( "Sorry, you are too high. I was thinking of " + answer + "." );
        }
    }
}