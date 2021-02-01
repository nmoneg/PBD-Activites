import java.util.Scanner;

public class CountingFor {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 ) {

            System.out.println( n + ". " + message );

        }
        //1. 'n = n+1' is indicating that at the end of the iteration, 'n'
        //      will be increased by 1. If this statement is removed, the 
        //      loop will continue indefinitely.     
        
        //2. 'int n = 1' establishes 'n' as the "counting variable" for 
        //      the loop. If you remove it, the code will not compile 
        //      it will no longer understand what 'n' is in the context 
        //      of the other conditions for the loop, ie 'n <= 5' and 'n = n+1'.
     }
}