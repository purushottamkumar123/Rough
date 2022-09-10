package Inheritance;

public class House {
    String color="white";
    void display(){
        System.out.println("HOUSE display");
    }
}
class Wall extends House{
    String color="Yellow";
    void display(){
        System.out.println("Wall display");
    }
    void printcolor(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.display();
    }


    public static void main(String[] args) {
        Wall w=new Wall();
        w.printcolor();
    }
}

