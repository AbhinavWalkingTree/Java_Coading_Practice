package Aggregation;

public class Employee {
    int id; String name;
    Address address;
    public Employee(int id, String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+ " " +name);
        System.out.println(address.city+" "+address.state+ " "+ address.country);
    }
    public static void main(String[] args) {
        Address address1=new Address("Prayagraj", "U.P.", "India");
        Address address2=new Address("Pratapgarh", "U.P.", "India");

        Employee e=new Employee(101,"Abhinav Tripathi",address1);
        Employee e1=new Employee(102,"Satyam Tripathi",address2);
        e.display();
        e1.display();
    }
} 
