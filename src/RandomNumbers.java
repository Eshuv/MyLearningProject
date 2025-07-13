import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random  random = new Random();
        int number;
        float num;
        boolean bool;
        number = random.nextInt(1, 7);
        num = random.nextFloat(1, 10);
        bool = random.nextBoolean();
        System.out.println(number);
        System.out.println(num);
        System.out.println(bool);
    }
}
