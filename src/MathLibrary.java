public class MathLibrary {
    public static void main(String[] args) {
            int principle = 20000000;
            int rate = 10;
            int time = 5;
            //int interest;
            
            // Interest = (PxRxT)/100
            
            int interest = (principle*rate*time)/100;
            
            System.out.println(interest);
    }
}
