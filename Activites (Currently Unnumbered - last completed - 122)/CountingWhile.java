import java.util.Scanner;

public class CountingWhile {

        public static void main(String[] args) {
            
                Scanner keyboard = new Scanner(System.in);

                System.out.println( "Type in a message, and I'll display it several times." );
                System.out.print( "Message: " );
                String message = keyboard.nextLine();
                System.out.print( "How many times? " );
                int howMany = keyboard.nextInt();

                int n = 0;
                while ( n < howMany ) {

                        System.out.println( (n + 1) * 10 + ". " + message );
                        n++;

                }

        // 1. 'n++' increases the value of the counter variable,
        //      'n', by one. Removing it would send the code
        //      into an infinite loop because 'n' would always
        //      be less than five.

        }
}