package Fibonacci;

public class Fibonacci_recyrsia {

    public static int m = 1;

    public static void main (String [] args) {

        System.out.println (fibonacci (6));
    }

    public static int fibonacci (int n) {
        System.out.println ("обращение к методу №" + (m++) + " n = " + n);
            if (n > 2) {
                return fibonacci(n - 1) + fibonacci(n - 2);
            } else {
                return n - 1;
            }
    }
}