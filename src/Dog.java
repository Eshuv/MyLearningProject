public class Dog extends Animal{

    @Override
    void eat()
    {
        System.out.println("The dog is eating.");
    }
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.eat();
        dog.sound();
    }
}
