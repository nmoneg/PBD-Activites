

public class EvennessFunction {

    public static void main(String[] args) {
                
        for ( int i = 1; i <= 20; i++ ) {
            
            System.out.print( i + " " );

            if ( isEven(i) == true ) {
                System.out.print( "<" );
            }

            if ( isDivisibleBy3(i) == true ) {
                System.out.print( "=" );
            }

            System.out.println();

        }


    }


    public static boolean isEven( int n ) {

        boolean is_true;

        if ( n%2 == 0 ) {
            is_true = true;
        } else {
            is_true = false;
        }

        return is_true;

    }


    public static boolean isDivisibleBy3( int n ) {

        boolean is_true;

        if ( n%3 == 0 ) {
            is_true = true;
        } else {
            is_true = false;
        }

        return is_true;

    }

}