package Non_Access_Modifires;
/*
public class Static {
    static String s="Hello Static Non-Access Modifires.";
}
/**
 * InnerStatic
  
  class InnerStatic {

    public static void main(String[] args) {
        System.out.println(Static.s);
    }
}*/


/*
 * OR-------------------------------------------------------------------
 */
 
  public class Static{
    //static variable
    static  int count=0;
    void myMethod(){
        count++;
        System.out.println(count);
    }
  }
  class InnerStatic{
    public static void main(String[] args){
        //First object Creation
        Static s1=new Static();
        //Method Calling for First Object
        s1.myMethod();

        //Second Object Creation
        Static s2=new Static();
        //Method Calling for second Object
        s2.myMethod();
    }
  }
  