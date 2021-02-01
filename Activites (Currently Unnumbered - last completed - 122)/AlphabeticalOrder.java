import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main( String[] args ){

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "What's your last name? " );
        String name = keyboard.next();

        if ( "Carswell".compareTo( name ) >= 0 ) {

            System.out.println( "You don't have to wait long, \"" + name + "\"." );

        }
        else if ( "Jones".compareTo( name ) >= 0 ) {

            System.out.println( "That's not bad, \"" + name + "\"." );

        }
        else if ( "Smith".compareTo( name ) >= 0 ) {

            System.out.println( "Looks like a bit of a wait, \"" + name + "\"." );

        }
        else if ( "Young".compareTo( name ) >= 0 ) {

            System.out.println( "It's gonna be a while, \"" + name + "\"." );

        }
        else {

            System.out.println( "You're not going anywhere for a while, \"" + name + "\"." );
            
        }
    }
}