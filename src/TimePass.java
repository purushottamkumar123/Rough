public class TimePass {
    int a;
    double d;
    char c;
    String str;

    void Display()
    {
        System.out.println("Value of a ="+a);
        System.out.println("Value of d="+d);
        System.out.println("Value of c="+c);
        System.out.println("Value of String="+str);
    }

    public static void main(String[] args) {
        int x;
        x=12;
        System.out.println("Value of X="+x);
        TimePass obj=new TimePass();
        /*obj.a=10;
        obj.d=12.12;
        obj.c='p';
        obj.str="Purushottam";*/
        obj.Display();



    }


}
