//area of circle
import java.util.*;
public class product{
    public static void main(String args[])
    {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        int radius= n.nextInt();
        n.close();

        double area=radius*radius*3.14;
        System.out.println("The radius of circle is:" +area);
    }
}
