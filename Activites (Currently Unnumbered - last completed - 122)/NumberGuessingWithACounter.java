import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter {

	public static void main( String[] args ){

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );
        System.out.print( "Your guess: " );
        int guess = keyboard.nextInt();
        int guessCount = 1;

        Random x = new Random();
        int number = 1 + x.nextInt(10);

        while ( guess != number ) {

            System.out.println( "That is incorrect. Guess again." );
            System.out.print( "Your guess: " );
            guess = keyboard.nextInt();
            guessCount++;

        }

        System.out.println( "That's right! You're a good guesser." );
        System.out.println(  "It only took you " + guessCount + " tries.");

    }
}