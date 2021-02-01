import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {

	public static void main( String[] args ){

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "I'm thinking of a number from 1 to 10. Try to guess it." );
        System.out.print( "Your guess: " );
        int guess = keyboard.nextInt();

        Random x = new Random();
        int number = 1 + x.nextInt(10);

        while ( guess != number ) {

            System.out.println( "That is incorrect. Guess again." );
            System.out.print( "Your guess: " );
            guess = keyboard.nextInt();

        }

        System.out.println( "That's right! You're a good guesser." );

    }
}