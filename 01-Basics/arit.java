package operators;

import java.util.*;
public class arit{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter A:");
        int A = num.nextInt();

        System.out.println("Enter B:");
        int B = num.nextInt();
        num.close();
        System.out.println("Additon of A and B is: "+ (A+B));
        System.out.println("Substraction of A and B is: "+ (A-B));
        System.out.println("Product of A and B is: "+ (A*B));
        System.out.println("Divison of A and B is: "+ (A/B));
        System.out.println("Modulus(remainder) of A and B is: "+ (A%B));
    
    }
}
