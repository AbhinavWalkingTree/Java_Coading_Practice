package Encapsulation;

public class RunEncaps {
    public static void main(String[] args){
        Encapsulation encaps=new Encapsulation();
        encaps.setName("Abhinav Tripathi");
        encaps.setIdNum("1");
        encaps.setAge(25);
        System.out.println(" ID :"+encaps.getIdNum()+",\n Name: "+encaps.getName()+",\n Age: "+encaps.getAge());
    }
}
