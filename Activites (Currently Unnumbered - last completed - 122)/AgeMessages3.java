import java.util.Scanner;

public class AgeMessages3
{
	public static void main( String[] args )
	{
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Your name: " );
        String name = keyboard.next();
        System.out.print( "Your age: " );
        int age = keyboard.nextInt();
        System.out.println();

        if ( age < 16 ) {

            System.out.println( "You can't drive, " + name + "." );

        }

        if ( age >= 16 && age < 18 ) {

            System.out.println( "You can drive but not vote, " + name + "." );

        }
            
        if ( age >= 18 && age < 25 ) {

            System.out.println( "You can vote but not rent a car, " + name + "." );
            
        }
    
        if ( age >= 25 ) {

            System.out.println( "You can do pretty much anything, " + name + "." );

        }
    }
}