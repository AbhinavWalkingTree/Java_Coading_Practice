package Encapsulation;

public class Encapsulation {
    private String name;
    private String idNum;
    private int age;


    public int getAge(){
        return age;
    }

    public String getIdNum(){
        return idNum;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        age=newAge;
    }

    public void setName(String newName){
        name=newName;
    }

    public void setIdNum(String newId){
        idNum=newId;
    }
    
}
/*
 * Note:Here you can see getter and setter methods we have used here in order to change the  private
 * data members of the class because these variables are only accessible to class methods and 
 * variables and any outside class member or object cannot change these private variables. 
 * so this is the concept of encapsulation.
 * 
 * 
 * Data abstraction can be achived using encapsulation.
 */