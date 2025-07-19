
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        String[] arr = {"Rock", "Paper", "Scissor"};
        try (Scanner sc = new Scanner(System.in)) {
            boolean wannaPlay = true;
            while(wannaPlay)
            {
                System.out.println("To choose write number: \n For Rock write : 1 \n For Paper write : 2 \nFor Scissor write : 3");
                int choice = sc.nextInt();
                String userChoice = arr[choice-1];
                Random random = new Random();
                String computerChoice = arr[random.nextInt(0, 3)];
                System.out.println("Your Choice : " + userChoice);
                System.out.println("Computer Choice : " + computerChoice);

                if(userChoice.equals(computerChoice))
                {
                    System.out.println("TIE!");
                }
                else
                {
                    if("Rock".equals(userChoice))
                {
                    if("Paper".equals(computerChoice))
                    {
                        System.out.println("Computer Wins!");
                    }
                    else
                    {
                        System.out.println("You Wins!");
                    }
                }
                if( "Paper".equals(userChoice))
                {
                    if("Scissor".equals(computerChoice))
                    {
                        System.out.println("Computer Wins!");
                    }
                    else
                    {
                        System.out.println("You Wins!");
                    }
                }
                if( "Scissor".equals(userChoice))
                {
                    if("Rock".equals(computerChoice))
                    {
                        System.out.println("Computer Wins!");
                    }
                    else
                    {
                        System.out.println("You Wins!");
                    }
                }
                }
                System.out.println("Do yo again wanna play! Write Y or y for Yes and N or n for No");
                char userPlayChoice = sc.next().charAt(0);
                wannaPlay = userPlayChoice == 'Y' || userPlayChoice == 'y';
            }
        }
    }
}
