package staticAndFinal;

public class Student {
    int rollno;
      String name;
     static String clname="C V Raman College of Engg BBSR";
    void dispaly()
    {
        System.out.println("Student Roll No="+rollno);
        System.out.println("Student Name ="+name);
        System.out.println("Student College Name ="+clname);
    }

    public static void main(String[] args) {
        Student obj=new Student();
        Student obj1=new Student();
        Student obj2=new Student();
        obj.rollno=12;
        obj.name="Purushottam";

        obj1.rollno=13;
        obj1.name="Amit Raj Vats";
        obj1.clname="IIT Patna";

        obj2.rollno=14;
        obj2.name="Anamnd";
        System.out.println(Student.clname);
        Student.clname="qwerty";
        Student.clname="RPS College of engg patna";



        obj.dispaly();
        obj1.dispaly();
        obj2.dispaly();

    }
}
