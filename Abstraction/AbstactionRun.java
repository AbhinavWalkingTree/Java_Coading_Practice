package Abstraction;

public class AbstactionRun {
    public static void main(String[] args) {
        Salary s=new Salary(001, "Abhinav Tripathi", "Prayagraj", 50000);
        Employee e=new Salary(002, "Satyam", "U.P.", 4999);
        System.out.println("Call Check Email using salary Reference -----");
        s.mailCheck();
        System.out.println("Call Check Email using Employee reference ------------");
        e.mailCheck();
    }
}



//if we want to access without defining salary class then
/*
 * public class AbstactionRun {
    public static void main(String[] args) {
        Employee s=new Employee(001, "Abhinav Tripathi", "Prayagraj", 50000); 
        System.out.println("Call Check Email using salary Reference -----");
        s.mailCheck();
   }
}

o/p:
            error:cannot Access Employee:
                   Employee s=new Employee(001, "Abhinav Tripathi", "Prayagraj", 50000); 
                         ^
                     bad source file ./Employee.java
                     file doesnot containe class file                                         
 */
