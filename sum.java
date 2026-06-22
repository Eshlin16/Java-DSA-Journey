//input from user 
import java.util.*;

public class sum{
    public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a =number.nextInt();

        System.out.println("Enter your second number:");
        int b =number.nextInt();

        System.out.println("Enter your third number:");
        float c=number.nextFloat();

        number.close();

        float d=a+b+c;
        System.out.println("Your sum is "+d);
    }
}