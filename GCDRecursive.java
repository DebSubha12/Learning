import java.util.Scanner;

public class GCDRecursive {

    // Recursive function to find GCD
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + result);

        sc.close();
    }
}