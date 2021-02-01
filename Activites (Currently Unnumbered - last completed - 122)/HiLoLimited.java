import java.util.Random;
import java.util.Scanner;

public class HiLoLimited { 
    public static void main ( String[] args ) {

        Scanner keyboard = new Scanner(System.in);
        Random x = new Random();

        int answer = 1 + x.nextInt(100);
        int count = 1;
        int max = 7;
        
        System.out.println( "I'm thinking of a number between 1-100. You have " + max + " guesses." );
        System.out.print( "First guess: " );             
        int guess = keyboard.nextInt();

        while ( guess != answer && count != max ) {

                if ( guess < answer ) {
                    System.out.println( "Sorry, you are too low." );
                }
                else if ( guess > answer ) {
                    System.out.println( "Sorry, that guess is too high." );
                }

                count++;
                System.out.print( "Guess # " + count + ": ");
                guess = keyboard.nextInt();

            }

        if ( guess == answer ) 
            System.out.println( "You guessed it! What are the odds?!?" );
        else 
            System.out.println( "Sorry, you didn't guess it in " + max + " tries. You lose." );
    }
}