import static java.lang.Math.*;

public class Calculator {
    public static void main(String[] args) {
        double pow = pow(4,5); // It returns the value of first argument raised to the power to second argument.
        double cbrt = cbrt(243); // It is used to return the cube root of a number.
        int max = max(23,142); // It returns the Largest of two values.
        double random = random()*23.232; // It returns a random number.
        double abs = abs(-2313.9923); // It will return the Absolute value of the given value.
        System.out.println("Four to the power of five is equal to " + pow);
        System.out.println("Cubic root of 243 is equal to " + cbrt);
        System.out.println("The max num between 23 and 142 is " + max);
        System.out.println("Random num between zero and 23.232: " + random);
        System.out.println("Absolute value of -2313.9923 is equal to " + abs);
    }
}
