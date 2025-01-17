package Non_Access_Modifires;

public class SynchronizedNAModifire {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();

        //Thred 1
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 1; i <=10000; i++) {
                    c.increment();
                }
            }
        });
        //Thred 2
        Thread t2= new Thread(new Runnable() {
           @Override
           public  void run(){
            for (int i = 1; i <=10000; i++) {
             c.increment();   
            }
           } 
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}

class Counter{
    int count;
    synchronized  void increment(){
        count++;
    }
}