import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class GenderGame
{
	public static void main( String[] args )
	{
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "What is your gender (M or F): " );
        String gender = keyboard.next();
        System.out.print( "First name: " );
        String first = keyboard.next();
        System.out. print( "Last name: " );
        String last = keyboard.next();
        System.out.print( "Age: " );
        int age = keyboard.nextInt();
        System.out.println();

        if ( gender.equals( "F" ) && age >= 20 ) {

            System.out.print( "Are you married, " + first + " (y or n)? ");
            String married = keyboard.next();
            System.out.println();

            if ( married.equals( "y" ) ) 
                first = "Mrs.";
            else
                first = "Ms.";

        }

        if ( gender.equals( "M") && age >= 20 )
            first = "Mr.";

        System.out.println( "Then I shall call you " + first + " " + last + "." );

    }
}

		