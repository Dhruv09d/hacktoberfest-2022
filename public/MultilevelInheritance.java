package Oops;

class Animal2 {
    void eat() {
        System.out.println("eating...");
    }
}
    class Dog2 extends Animal2{
        void bark(){
            System.out.println("barking...");
        }
    }
    class BabyDog extends Dog2{
    void weep(){
        System.out.println("weeping...");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d= new BabyDog();
        d.eat();
        d.bark();
        d.weep();
    }
}
