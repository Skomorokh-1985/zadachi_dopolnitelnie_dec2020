package Fibonacci;

public class Fibonacci_cycle {

    public static void main (String [] args) {

        System.out.println (fibonacci (1));
        System.out.println (fibonacci (2));
        System.out.println (fibonacci (3));
        System.out.println (fibonacci (4));
        System.out.println (fibonacci (5));
        System.out.println (fibonacci (6));
        System.out.println (fibonacci (7));
        System.out.println (fibonacci (8));
        System.out.println (fibonacci (9));
        System.out.println (fibonacci (10));
        System.out.println (fibonacci (11));
    }

    public static int fibonacci (int n) {
        if (n == 1) {
            return 0;
        } else {
            int a = 0;
            int b = 1;
            int k = 2;
            int sum = 1;
            while (k <= n-1) {
                sum = a + b;
                a = b;
                b = sum;
                k++;
            }
            return sum;
        }
    }
}


