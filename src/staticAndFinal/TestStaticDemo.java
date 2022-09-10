package staticAndFinal;

/*import static staticAndFinal.StaticMethodDemo.StaticMethod1;
import static staticAndFinal.StaticMethodDemo.StaticMethod2;
import static staticAndFinal.StaticMethodDemo.clname;*/
import static staticAndFinal.StaticMethodDemo.*;

public class TestStaticDemo {
    public static void main(String[] args) {
        StaticMethodDemo obj=new StaticMethodDemo();
        StaticMethod1();
        StaticMethod2();
        obj.nonStaticMethod();
        StaticMethod2();
        StaticMethod1();

        StaticMethod1();
        StaticMethod2();
        clname="pooo";

    }
}
