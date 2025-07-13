public class Loops {
    public static void main(String[] args)
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;
        while(i < 100)
        {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        do {
            System.out.print(i + " ");
        }while(i < 100);
    }
}
