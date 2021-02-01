

public class FindingPrimeNumbers {

    public static void main(String[] args) {
        
        for ( int i = 2; i <= 100; i++ ) {

            if ( isPrime(i) == true ) {
                System.out.println( i );
            }

        }

    }


    public static boolean isPrime( int n ) {

        int x = 0;
        boolean is_true; 
       
        
        for ( int i = 2; i<n; i++ ) {

            if ( n%i == 0 ) {
                x++;
                break;
            }
        }

        if ( x > 0 ) {
            is_true = false;
        } else {
            is_true = true;
        }

        return is_true;

    }

}