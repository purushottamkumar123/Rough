package Abstraction;

public interface Interface2 {
    void run();
    void display();
    void start();

}
interface Interface3
{
    void display();

}
class ChildInterface implements Interface2,Interface3
{

    @Override
    public void run() {
        System.out.println("Inside run");
    }

    @Override
    public void display() {
        System.out.println("Inside display");

    }

    @Override
    public void start() {
        System.out.println("Inside start");

    }
}
class Test{
    public static void main(String[] args) {
        Interface2 obj=new ChildInterface();
        obj.display();
        obj.run();
        obj.start();

    }
}
