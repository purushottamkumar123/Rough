package Inheritance;

public class Java {
    int sailary=20000;

}
class Java2 extends Java{
    int bonous=3000;
    public static void main(String[] args) {
        Java2 obj=new Java2();
        System.out.println("bonous="+obj.bonous);
        System.out.println("Sailary="+obj.sailary);

    }

}