import java.util.Scanner;

public class Refresher2 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "What is your name: " );
        String name = keyboard.next();
        System.out.println();
        int n = 10;

        if ( name.equals("Mitchell") ) {
            n = 5;
        }
       
        for ( int i = 0; i < n; i++ ) {
                System.out.println( name );
        }

    }

}