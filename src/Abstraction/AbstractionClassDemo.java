package Abstraction;

public abstract class AbstractionClassDemo {
    abstract void run();
    abstract void start();
    void display()
    {
        System.out.println("Inside dipslay method");
    }

}
class ChildClass extends AbstractionClassDemo{

    @Override
    void run() {
        System.out.println("Inside Run ");
    }

    @Override
    void start() {
        System.out.println("Inside statr");
    }
}
class TestAbstraction{
    public static void main(String[] args) {
       // AbstractionClassDemo obj=new AbstractionClassDemo();
        AbstractionClassDemo obj=new ChildClass();
        obj.display();
        obj.run();
        obj.start();
    }
}
