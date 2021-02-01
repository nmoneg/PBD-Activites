import java.util.Scanner;

public class SafeSquareRoot {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "SQUARE ROOT!" );
        System.out.print( "Enter a number: " );
        int entry = keyboard.nextInt();

        while ( entry < 0 ) {

            System.out.println( "You can't take the square root of a negative number, silly." );
            System.out.print( "Try again: " );
            entry = keyboard.nextInt();

        }

        double sqrt = Math.sqrt( entry );

        System.out.println( "The square root of " + entry + " is " + sqrt + "."  );

    }
}