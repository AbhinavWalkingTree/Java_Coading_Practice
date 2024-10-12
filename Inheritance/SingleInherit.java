package Inheritance;



    class Animals{
        void eat(){
            System.out.println("Is Eating to Break");
        }
    }
    class Dog extends Animals{
        void bark(){
            System.out.println("Is barking Over the Thief");
        }
    }


public class SingleInherit {
    //EXAMPLE : Animals

    public static void main(String[] args) {
        Dog d=new Dog ();
        d.bark();
        d.eat();
    }
    
}
/*
 * Single Inheritance:
 *           When a class inherits another class, it is known as single inheritance.
 */