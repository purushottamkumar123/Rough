package staticAndFinal;

public class FinalVariableDemo {
   final int speed =200;
    void change(){
       //speed=100;

    }

    public static void main(String[] args) {
        FinalVariableDemo obj=new FinalVariableDemo();
        obj.change();
        System.out.println(obj.speed);

    }
}
