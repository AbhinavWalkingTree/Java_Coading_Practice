package Polymorphism;
  class Vhaicle{
                    void run(){
                        System.out.println("Vhaicle is Running:");
                    }
                }
                class Car extends Vhaicle{
                    void run(){
                        System.out.println("Car is running: ");
                    }
                }


public class RunTimePoliMtdOverride {
              public static void main(String[] args) {
                //Creating obj
                Vhaicle v1=new Car();
                //now we are calin print method  inside main() Method
                v1.run();


                //when the obj Behave as Vhaicle
                Vhaicle v2=new Vhaicle();
                v2.run();
              }
    
}
/*
 * Run-time polymorphism:
 *  It is also known as Dynamic Method Dispatch. It is a process in which a function call to the 
 *  overridden method is resolved at Runtime. 
 *  Method Overriding achieves this type of polymorphism. 
 *  On the other hand, method overriding occurs when a derived class has a definition for one of the
 *  member functions of the base class. 
 *  That base function is said to be overridden. 
 *  Method overriding:
 *  In as imple language, when we have two classes, one is child class, and the other is parent class,
 * and when we write the same function in both the child class and the parent class, the method is 
 * said to be overridden.
 */