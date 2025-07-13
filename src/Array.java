import java.util.*;

public class Array {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int[] marks = new int[3];

        for(int i = 0; i < marks.length; i++)
        {
            try (Scanner sc = new Scanner(System.in)) {
                int num = sc.nextInt();
                marks[i] = num;
            }
        }

        System.out.println();

        for(int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }
    }
}
