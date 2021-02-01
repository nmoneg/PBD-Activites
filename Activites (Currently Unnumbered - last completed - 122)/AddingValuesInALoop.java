import java.util.Scanner;

public class AddingValuesInALoop { 

        public static void main ( String[] args ) {

                Scanner keyboard = new Scanner(System.in);

                System.out.println( "I will add up the numbers you give me.");
                System.out.print( "Number: " );
                int input = keyboard.nextInt();
                int sum;
                int total = input; 

                while ( input != 0 ) {

                        sum =  total;  
                        System.out.println( "The total so far is " + total );
                        System.out.print( "Number: " );
                        input = keyboard.nextInt();
                        total = sum + input;
                }
                
                System.out.println( "\nThe total is " + total + ".");
    }
}