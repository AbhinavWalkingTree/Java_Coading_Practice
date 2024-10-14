package Streams;

// package Polymorphism;



//MAIN CLASS
public class CplTimePoliMtdOverload {
              //MAIN method
              public static void main(String[] args) {
                // Helpre h=new Helper();
                //calling  method by passing
                //input as in argument
                System.out.println("Output of Method with two int parameter in Helper Class: "+Helper.multiply(19, 40)); 
                System.out.println("Output of Method with two  parameter DOUBLE and INTEGER in Helper Class: "+Helper.multiply(10.0, 23450));
                System.out.println("Output of Method with three parameter 1 DOUBLE and 2 INTEGER: "+Helper.multiply(9813.32, 8272, 765));
              }
   
}


//HELPER CLASS
class Helper{
  
    //Method with two int parameter
    static int multiply(int a , int b){
        //Return product of a and b
        return a*b;
    }
       //Method with two  parameter DOUBLE and INTEGER
    static double multiply(double a, int b){
        return a*b;
    }
       //Method with three parameter 1 DOUBLE and 2 INTEGER
    static double multiply(double a, int b, int c){
        return a*b*c;
    }
}
/*
* Compile-time polymorphism:
* It is also known as static polymorphism. This type of polymorphism is achieved by Method Overloading
* or operator overloading 
* Note:- operator overloading is not supported by java. 
* Method overloading:
* when we have more than one function/method in the same class with the same name and number of 
*arguments 
*/
