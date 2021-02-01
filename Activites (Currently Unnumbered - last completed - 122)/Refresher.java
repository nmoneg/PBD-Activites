import java.util.Scanner;

public class Refresher {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "What is your name: " );
        String name = keyboard.next();
        System.out.println();
        int n;

        if ( name.equals("Mitchell") ) {

            n = 5;

            for ( int i = 0; i < n; i++ ) {
                System.out.println( name );
            }            

        } else {

            n = 10;

            for ( int i = 0; i < n; i++ ) {
                System.out.println( name );
            }

        }

    }

}