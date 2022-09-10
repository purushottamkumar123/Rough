package Methods;

public class MethodsArgument {

    void printstatement(){
        System.out.println("Purushottam");
        System.out.println("Amit");
        System.out.println("RaviRanjan");
        System.out.println("NishnatRanjan");
    }
    void printValueA(int a){
        System.out.println("The Value of a is ="+a);
    }
    void printMultipleValue(int a,int b){
        System.out.println("The Value of A is ="+a);
        System.out.println("The Value of B is ="+b);
    }
    void printValue(int a,double d,String s){
        System.out.println("The Value of int is ="+a);
        System.out.println("The Value of double is ="+d);
        System.out.println("The Value of String is ="+s);
    }

    public static void main(String[] args) {
        MethodsArgument obj=new MethodsArgument();
        obj.printstatement();
        obj.printValueA(20);
        obj.printMultipleValue(20,30);
        obj.printValue(20,20.22,"Purushottam kumar");
    }
}
