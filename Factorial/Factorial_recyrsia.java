package Factorial;

public class Factorial_recyrsia {

    public static void main (String [] args) {

        System.out.println (factorial (4));
        System.out.println (factorial (5));
        System.out.println (factorial (6));
    }

    public static int factorial (int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }

}