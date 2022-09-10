public class SwitchDemo {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int c;
        String operation="Multiplication";
        switch (operation)
        {
            case "Add" : c=a+b;
                System.out.println("Addition "+c);
                break;
            case "Subs": c=a-b;
                System.out.println("Substraction "+c);
                break;
            case"Multiplication":c=a*b;
                System.out.println("Multiplication "+c);
               // break;
            case"Division":c=a/b;
                System.out.println("Division "+c);
                break;
            default:
                System.out.println("Wrong Credentials");
                break;
        }

    }
}
