package Aggregation;
//superkeyword use 
public class Animal {
    Animal(){
        System.out.println("Animal is Created");
    }
}
    class Dog extends Animal{
        Dog(){
            
            System.out.println("Dog is Created");
        }
    }
    class TestSuper4{
        public static void main(String[] args) {
            Dog d = new Dog();
        
        }
    }

