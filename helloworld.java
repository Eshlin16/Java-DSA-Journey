//printing name and age using input from user
import java.util.*; 
public class helloworld {
    public static void main(String arg[])
    {
        Scanner number =new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=number.nextLine();

        System.out.println("Enter your age:");
        int age=number.nextInt();
        number.close();

        System.out.println("Hello "+name+ " you are " +age+ " years old.");

    }
}