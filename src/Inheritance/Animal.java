package Inheritance;

public class Animal {
    void eat(){
        System.out.println("Eat");
    }

}
      class Dog extends Animal {
      void bark()
      {
        System.out.println("Bark");
    }

}
      class BabyDog extends Dog {
      void Weep(){
        System.out.println("Bark");
    }

}
    class TestInheritance{
        public static void main(String[] args) {
            Animal a=new Animal();
            a.eat();
            Dog d= new Dog();
            d.bark();
            d.eat();
            BabyDog bd= new BabyDog();
            bd.Weep();
            bd.bark();
            bd.eat();
        }
    }

