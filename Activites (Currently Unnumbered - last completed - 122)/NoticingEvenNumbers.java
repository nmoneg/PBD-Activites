public class NoticingEvenNumbers {

    public static void main(String[] args) {
        
        for ( int n = 1; n <= 20; n++ ) {
            
            if ( n%2 != 0 ) {
                System.out.println( n );
            } else {
                System.out.println( n + " <");
            }
        }
    }
}