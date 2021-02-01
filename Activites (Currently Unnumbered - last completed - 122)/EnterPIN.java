import java.util.Scanner;

public class EnterPIN {

    public static void main(String[] args) {
        
            Scanner keyboard = new Scanner(System.in);
            int pin = 12345;

            System.out.println( "WELCOME TO THE BANK OF MITCHELL." );
            System.out.print( "ENTER YOUR PIN: " );
            int entry = keyboard.nextInt();

            while ( entry != pin ) {
                
                System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
                System.out.print( "ENTER YOUR PIN: " );
                entry = keyboard.nextInt();

            }

            System.out.println( "\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT." );
 
            // 1. A 'while' loop is similar to an 'if' statement 
            //      because they both will only execute if the 
            //      conditions specified are executed. 
            
            // 2. A 'while' loop is different to an 'if' statement
            //      because it will repeat its execution as long as 
            //      the conditions are met. 'If' statements only
            //      execute once. 

            // 3. There isn't an 'int' in front of the entry on
            //      line 18 because a new variable isn't being 
            //      created, only reassigned a new value based
            //      on user input.

            // 4. If you delete line 18, the code will enter a 
            //      very obnoxious endless loop if the wrong
            //      PIN is entered. This is because there is no
            //      longer any way to change the user entry after
            //      the first attempt. 

        }
}