public class ConstructorChaining
{
    int id, age;
    String name,address;
    public ConstructorChaining(int age){
        this.age=age;
    }
    public ConstructorChaining(int id,int age){
        this(age);
        this.id=id;
    }
    public ConstructorChaining(int id,int age,String name,String address){
        this(id,age);
        this.name=name;
        this.address=address;

    }
    public static void main(String[] args) {
        ConstructorChaining emp= new ConstructorChaining(105,22,"Abhinav", "Prayagraj");
        System.out.println("ID : "+emp.id+ "Name : "+emp.name+" Age : "+emp.age+"Address : "+emp.address);

    }
}