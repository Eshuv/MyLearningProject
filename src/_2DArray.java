public class _2DArray {

    public static void main(String[] args)
    {
        int[][] myNumber = {{1,2,3}, {4,5,6}};

        for(int i = 0; i < myNumber.length; i++)
        {
            for(int j = 0 ; j < myNumber[i].length; j++)
            {
                System.out.print(myNumber[i][j] + " ");
            }
        }

        System.out.println();

        for(int[] row : myNumber)
        {
            for(int num : row)
            {
                System.out.print(num + " ");
            }
        }
    }
}
