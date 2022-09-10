package Abstraction;

public interface InterfaceDemo {
    void run();
    void start();
    default void display()
    {
        System.out.println("Inside display method");
    }
    static void display1()
    {
        System.out.println("Inside display1");
    }


}
class InterfaceDemo2 implements InterfaceDemo
{

    @Override
    public void run() {
        System.out.println("Inside run");
    }

    @Override
    public void start() {
        System.out.println("Inside start");

    }
}
class TestDemo
{
    public static void main(String[] args) {
        InterfaceDemo obj=new InterfaceDemo2();
        obj.display();
        obj.run();
        obj.start();
        InterfaceDemo.display1();
    }
}
