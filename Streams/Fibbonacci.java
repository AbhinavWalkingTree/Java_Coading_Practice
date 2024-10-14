package Streams;

import java.util.Scanner;

public class Fibbonacci {
    // public void fibonacci(int n){
    //     int a=0, b=1; 
    //     System.out.print("Fibonacci series: " + a); 
    //     if (n > 1) {
    //         System.out.print(", " + b); 
    //     }
    //     for (int i=2; i<n; i++){
    //         int next =a+b;
    //         System.out.print(","+next);
    //         a=b;
    //         b=next;
    //     }
    // }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num=scanner.nextInt();
        // Fibbonacci fibbonacci=new Fibbonacci();
        // fibbonacci.fibonacci(num);

         

        long a = 0, b = 1;
        System.out.print("Fibonacci series: " + a);
        
        while (b <= num) {
            System.out.print(", " + b);
            long next = a + b;
            a = b;
            b = next;
        }   
     }
}
