public class BubbleSort {

    public static void bubbleSort(int[] arr)
    {
        int sz = arr.length;

        for(int i = 0; i < sz; i++)
        {
            for(int j = 0; j < sz - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {6,5,4,3,2,1};

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
