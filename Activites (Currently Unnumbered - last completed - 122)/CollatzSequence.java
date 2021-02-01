import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int n;
        int a;

        System.out.print( "Starting number: " );
        n = keyboard.nextInt();
        System.out.print( n + "\t");

        while ( n != 1 ) {

            if ( n%2 == 0 ) {
                
                a = n / 2;
                n = a;
                System.out.print( n + "\t");

            } else {

                a = 3*n + 1;
                n = a;
                System.out.print( n + "\t");

            }

            keyboard.close();

        }
    }
}