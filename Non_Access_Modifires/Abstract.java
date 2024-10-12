package Non_Access_Modifires;

public class Abstract {
    public static void main(String[] args) {
        Abstract2 obj=new Abstract2();
        obj.myMethod();
    }
    
}
//Abstract Class
abstract class Abstract1{
    abstract void myMethod();
}
//Extending Abstract  class
class Abstract2 extends Abstract1{
    void myMethod(){
        System.out.println("This is Abstract Method in Extended class.");
    }
}