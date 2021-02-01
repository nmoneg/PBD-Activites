import java.util.Scanner;
 
public class RightTriangleChecker {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int a;
        int b;
        int c;
        

        System.out.println( "Enter three integers: " );

        System.out.print( "Side 1: " );
        a = keyboard.nextInt();
        System.out.print( "Side 2: " );
        b = keyboard.nextInt();

        while ( b < a ) {

            System.out.println( b + " is smaller than " + a + ". Try again." );
            System.out.print( "Side 2: " );
            b = keyboard.nextInt();

        }

        System.out.print( "Side 3: " );
        c = keyboard.nextInt();

        while ( c < b ) {

            System.out.println( c + " is smaller than " + b + ". Try again." );
            System.out.print( "Side 3: " );
            c = keyboard.nextInt();

        }

        System.out.println( "\nYour three sides are " + a + " " + b + " " + c );

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        if ( a2 + b2 != c2 ) {
            System.out.println( "NO! These sides do not make a right triangle!" );

        } else {
            System.out.println( "These sides *do* make a right triangle. Yippy-skippy!" );
        }
    }
}