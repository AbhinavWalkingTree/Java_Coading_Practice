package Abstraction;

// Define an abstract class named Employee
public abstract class Employee {
    
    // Declare private instance variables for name, address, and id
    private String name;
    private String address;
    private int id;

    // Constructor to initialize the instance variables
    public Employee(int id, String name, String address){
        System.out.println("Constructing the Employee: ");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Define a method named computePay
    // This method is marked as abstract, which means subclasses must provide their own implementation
     //public abstract computePay();
    public   Double computePay(){
        System.out.println("Inside Employee ComputePay.");
        return 0.0;
    }

    // Define a method named mailCheck
    public void mailCheck(){
        System.out.println("Mailing a Check to " + this.name + " of " + this.address+".");
    }

    // Override the toString method to provide a custom string representation
    public String toString(){
        return id + " " + name + " " + address;
    }

    // Getter method for id
    public int getId(){
        return id;
    }

    // Getter method for name
    public String getName(){
        return name;
    }

    // Getter method for address
    public String getAddress(){
        return address;
    }

    // Setter method to update the address
    public void setAddress(String newAddress){
        // This line is incorrect. It should be: this.address = newAddress;
        address= newAddress;
    }
}

/*
 * class TestAbstraction { 
 * public static void main( String args[] ) { 
 *      int min = Math.min(15,18);
 *       //find min of two numbers 
 *      double square = Math.pow(2,2); //calculate the power of a number
 *       System.out.println("Theminof15&18is: "+min);
 *      System.out.println("Thesquareof 2 is: " + square) 
 * } 
 * } 
 * In the above code: 
 *                   Math.min() find min of two num Math.max() find max of two num But
 *                  the user doesn’t have to know about the implementation of these two methods inside
 *                   the Math class.
 */