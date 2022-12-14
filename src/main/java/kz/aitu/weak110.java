package kz.aitu;
import java.util.Scanner;
public class weak110 {
    // Java program to find GCD of two numbers

        static int gcd(int a, int b)
        {
            // Everything divides 0
            if (a == 0)
                return b;
            if (b == 0)
                return a;

            // base case
            if (a == b)
                return a;

            // a is greater
            if (a > b)
                return gcd(a-b, b);
            return gcd(a, b-a);
        }

        // Driver method
        public static void main(String[] args)
        {
            Scanner scanner= new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
        }

}
