import java.util.*;

public class Function {
    public static int Add(int a, int b)
    {
        return a+b;
    }

    public static int Add()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        return a + b;
    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        //System.out.println(Add(a, b));
        System.out.println(Add(a, b));
        System.out.println(Add());
    }
}






