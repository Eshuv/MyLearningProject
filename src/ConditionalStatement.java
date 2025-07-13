import java.util.*;

public class ConditionalStatement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("You are an Adult.");
        }
        else if (age > 12)
        {
            System.out.println("You are a teenager");
        }
        else
        {
            System.out.println("You are not an Adult.");
        }
    }
}
