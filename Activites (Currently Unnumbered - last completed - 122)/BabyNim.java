import java.util.Scanner;

public class BabyNim {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int a = 3;
        int b = 3;
        int c = 3;
        int input;
        int result;
        String pile = "";

        System.out.println( "A: " + a + "\tB: " + b + "\tC: " + c );

        while ( (a > 0) || (b > 0) || (c > 0) ) {

            System.out.print( "\nChoose a pile: " );
            pile = keyboard.next();
            System.out.print( "How many to remove from pile " + pile + ": " );
            input = keyboard.nextInt();

            if ( pile.equals( "A" ) ) {

                result = a - input;
                a = result;

            } 
            if ( pile.equals( "B" ) ) {

                result = b - input;
                b = result;

            } 
            if ( pile.equals( "C" ) ) {

                result = c - input;
                c = result;

            }
                System.out.println( "\nA: " + a + "\tB: " + b + "\tC: " + c );

        } 
        System.out.println( "\nAll piles are empty. Good job!" );

    }

}