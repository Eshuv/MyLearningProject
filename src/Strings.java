import java.util.Scanner;

public class Strings {

    public static void main(String[] args)
    {
        String girlName = "Vaishali Upadhyay";
        String boyName;

        Scanner sc = new Scanner(System.in);
        boyName = sc.nextLine();

        System.out.println(girlName + " weds " + boyName);
        System.out.println("Who will win the fight between " + boyName + " " + girlName + "?\n");
        if(girlName.compareTo(boyName) > 0)
        {
            System.out.println("Vaishali will win the fight");
        }
        else
        {
            System.out.println("Abhay will win the fight");
        }
    }
}
