import java.util.Scanner;

public class AddingValuesForLoop {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        System.out.print( "Number: " );
        int number = kb.nextInt();
        System.out.println();
        int sum = 0;

        for ( int n = 1; n <= number; n++ ) {

            System.out.print( n + " " );
            sum = sum + n;

        }
        System.out.println( "\nThe sum is " + sum + ".");
    }
}

