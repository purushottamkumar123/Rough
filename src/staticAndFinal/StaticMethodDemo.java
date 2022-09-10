package staticAndFinal;

public class StaticMethodDemo {
   public int rollno;
   public String name;
   public static String clname="C V Raman College of Engg BBSR";
   public void dispaly()
    {
        System.out.println("Student Roll No="+rollno);
        System.out.println("Student Name ="+name);
        System.out.println("Student College Name ="+clname);
        nonStaticMethod();
        StaticMethod1();
      //  StaticMethod2(); // amol commented
    }
    public void nonStaticMethod()
    {
        System.out.println("Print Non Static Method");
        System.out.println("Student Name ="+name);

        // amol added
    }
   public static void StaticMethod1()
    {
        System.out.println("Print  Static Method1");
        System.out.println("Student College Name ="+clname);
        //System.out.println("Student Name ="+name);
        //nonStaticMethod();
        StaticMethod2();
    }
    public static void StaticMethod2()
    {
        System.out.println("Print  Static Method2");
        //System.out.println("Student Name ="+name);

    }

    public static void main(String[] args) {
        StaticMethodDemo obj=new StaticMethodDemo();
        obj.StaticMethod2();
        obj.nonStaticMethod();
        obj.StaticMethod1();
        StaticMethodDemo.StaticMethod2();
        StaticMethodDemo.StaticMethod1();


    }
}
