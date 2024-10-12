package Abstraction;

public class Salary extends Employee {


    private Double salary;

    public Salary(int id, String name, String address, double salary) {
        super(id, name, address);
        setSalary(salary);
    }


    public void mailCheck(){
        System.out.println("With in check Email in Salary class: ");
        System.out.println("Mailing Check to "+this.getName()+" with salary "+this.getSalary()+".\n");
    }


      public double getSalary(){
        return salary;
    }


    public void setSalary(Double salary2) {
        if (salary2>=0.0) {
            salary=salary2;
        }
    }

  
    public Double computePay(){
        System.out.println("Computing Salary pay for "+this.getName());
        return salary/52;
    }
    
}
