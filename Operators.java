    public class Operators {
        public static void main(String[] args) {
            int a;
            int b;
            int c;
            a=10;
            b=15;
            c=0;
            int d =-9;
            boolean e=false;
            boolean f=true;
            System.out.print("Addition (Arithmetic Operator) Of a & b is : ");
            System.out.println(c=a+b);
            System.out.print("Subtraction (Arithmetic Operator) of b & a is :");
            System.out.println(c=b-a);
            System.out.print("Division (Arithmetic Operator) of  b & a :");
            System.out.println(c=a/b);
            System.out.print("Modulas (Arithmetic Operator) of a & b : ");
            System.out.println(c=a%b);
            System.out.print("Multiplication (Arithmetic Operator)of a & b : ");
            System.out.println(c=a*b);
            System.out.print("Comparision of a < b :");
            System.out.println( (boolean)(a<b));
            
            System.out.print("Comparision of a > b :");
            System.out.println( (boolean)(a>b));
            
            System.out.print("Comparision of a = b :");
            System.out.println(   (boolean)(a==b));
            System.out.print("Comparision of b = a :");
            System.out.println(   (boolean)(b==a));
            System.out.print("Shift of a  to left in 3 position :");
            System.out.println(   a<<3);
            System.out.print("Shift of a  to right in 3 position :");
            System.out.println(   a>>3);
            System.out.print("increment (Unary Operators) of a  to 1 :");
            System.out.println(  ++a +" and "+ a++);
            System.out.print("increment (Unary Operators) of b  to 1 :");
            System.out.println(  ++b +" and "+ b++);
            
            System.out.print("Dicrement (Unary Operators) of a  to 1 :");
            System.out.println(  --a +" and "+ a--);
            
            System.out.print("minus of total positive value which starts from 0 (Unary Operators) of b    :");
            System.out.println(  ~b);

    System.out.print(" positive of total minus, positive starts from 0(Unary Operators) of d    :");
    System.out.println(  ~d);
    System.out.print("opposite of boolean value (Unary Operators) of e    :");
    System.out.println(  !e);
    System.out.print("opposite of boolean value (Unary Operators) of f    :");
            System.out.println(  !f);
            System.out.println(a<b&&a<c);// Logical && Logical &&false && true = false  
            System.out.println(a<b&a<c);//Bitwise &Bitwise &false & true = false  

            
    System.out.println(a<b&&a++<c);// Logical &&false && true = false  
    System.out.println(a);//10 because second condition is not checked  
    System.out.println(a<b&a++<c);//Bitwise &false && true = false  
    System.out.println(a);//11 because second condition is checked  

    
    System.out.println(a>b||a<c);// Logical || , Logical || true || true = true  
    System.out.println(a>b|a<c);//Bitwise |, true | true = true  
    //|| vs |  
    System.out.println(a>b||a++<c);//true || true = true  
    System.out.println(a);//10 because second condition is not checked  
    System.out.println(a>b|a++<c);//true | true = true  
    System.out.println(a);//11 because second condition is checked  

    int min=(a<b)?a:b;  
    System.out.println("Ternary Operator  :"  + min); //Ternary Operator

    a+=4;//a=a+4 (a=10+4)  
    b-=4;//b=b-4 (b=20-4)  
    System.out.println("Assignment Operator  " + a);  
    System.out.println("Assignment Operator  "+ b);  

    a+=4;//a=a+4 (a=10+4)  
    b-=4;//b=b-4 (b=20-4)  
    System.out.println("Assignment Operator  "+ a);  
    System.out.println("Assignment Operator  "+b);  



            
        }
    }
