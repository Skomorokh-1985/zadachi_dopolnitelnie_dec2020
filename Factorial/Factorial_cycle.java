package Factorial;

public class Factorial_cycle {

    public static void main (String [] args) {

        System.out.println (factorial (4));
        System.out.println (factorial (5));
        System.out.println (factorial (6));
    }

    public static int factorial (int n) {
        int result = 1;
       while ( n > 0 ) {
           result*=n--;
       }
       return result;
    }

}
