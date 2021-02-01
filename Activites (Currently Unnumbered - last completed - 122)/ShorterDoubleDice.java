import java.util.Random;

public class ShorterDoubleDice { 
    
    public static void main ( String[] args ) {

        System.out.println( "HERE COMES THE DICE!" );

        Random x = new Random();
        int roll1;
        int roll2;
        int total;

        do {

            roll1 = 1 + x.nextInt(6);
            roll2 = 1 + x.nextInt(6);
            total = roll1 + roll2;

            System.out.println( "\nRoll #1: " + roll1 );
            System.out.println( "Roll #2: " + roll2 );
            System.out.println( "The total is " + total + "!");
        
       } while ( roll1 != roll2 );
    }
}