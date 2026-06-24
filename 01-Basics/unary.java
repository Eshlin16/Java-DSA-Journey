package operators;
import java.util.*;

public class unary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();

        // Demonstrate post-increment
        System.out.println("Using a++ (post-increment): " + (a++));
        System.out.println("Value of a after post-increment: " + a);

        // Demonstrate pre-increment
        System.out.println("Using ++a (pre-increment): " + (++a));
        System.out.println("Value of a after pre-increment: " + a);
    }
}

