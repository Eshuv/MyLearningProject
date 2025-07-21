public class InterfaceImplements implements DemoInterface{
    
    @Override
    public void show()
    {
        System.out.println("I am using show function.");
    }

    public static void main(String[] args) {
        InterfaceImplements inst = new InterfaceImplements();
        inst.show();
    }
}
