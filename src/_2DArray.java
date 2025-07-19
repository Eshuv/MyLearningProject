public class _2DArray {

    public static void main(String[] args)
    {
        int[][] myNumber = {{1,2,3}, {4,5,6}};

        for (int[] myNumber1 : myNumber) {
            for (int j = 0; j < myNumber1.length; j++) {
                System.out.print(myNumber1[j] + " ");
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
