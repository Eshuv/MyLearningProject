public class VariableArguments {

    static int add(int... nums)
    {
        int sum = 0;
        for(int num : nums)
        {
            sum += num;
        }
        return sum;
    }

    static int average(int... nums)
    {
        int sum = 0;
        for(int num : nums)
        {
            sum += num;
        }
        int average = sum / nums.length;
        return average;
    }
    public static void main(String[] args) {
        int sum = add(1,2,3,4,5,6,7,8);
        System.out.println(sum);

        int average = average(1,2,3,4,5,6,7,8);
        System.out.println(average);
    }
}
