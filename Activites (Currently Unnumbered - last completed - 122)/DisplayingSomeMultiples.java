import java.util.Scanner;

public class DisplayingSomeMultiples {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Choose a number: " );
        int n = keyboard.nextInt();
        System.out.println();
        int y;
       
        for ( int i = 1; i <= 12; i++ ) {
            
            y = n*i;
            System.out.println( n + "x" + i + " = " + y );
            
        }

    }

}