import java.util.Scanner;

public class WorstGuessing {

	public static void main( String[] args ){

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "TEH WORST NUBMER GESSING GAME EVAR!!!!!!!!!1!" );
        System.out.println();
        System.out.print( "I\"M THKING OF A NBR FROM 1-10. TRY 2 GESS! " );
        int gus = keyboard.nextInt();
        System.out.println();

        int num = 9;

        if ( gus == num ) {

            System.out.println( "LOL!!! U GOT IT! I CANT BELEIVE U GESSED IT WAS " + num + "!" );

        }
        else {

            System.out.println( "W00T! U SUX0R!!! I PWN J00!!! IT WAS " + num + "!" );

        }

    }
}