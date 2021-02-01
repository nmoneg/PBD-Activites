import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

	public static void main( String[] args ){

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "I'm thinking of a number from 1 to 10." );
        System.out.print( "Your guess: " );
        int guess = keyboard.nextInt();
        System.out.println();

        Random x = new Random();
        int number = 1 + x.nextInt(10);

        if ( guess == number ) {

            System.out.println( "That's right!" );

        }
        else {

            System.out.println( "Sorry, but I was really thinking of " + number + "." );

        }
    }
}