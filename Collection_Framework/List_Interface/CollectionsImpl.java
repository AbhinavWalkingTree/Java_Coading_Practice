package Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;


public class CollectionsImpl {
    public static void main(String[] args) {
        //Create and initialize ArrayList
        ArrayList<Integer> list=new ArrayList<Integer>( );


        //Add the Element in list
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("LIST :"+list);

       // Create a reverse order comparator for integers
       Comparator<Integer> reverseComparator = Comparator.reverseOrder();

       // Sort the list in reverse order
       list.sort(reverseComparator);

       // Print the sorted list
       System.out.println("Reverse Sorted list: " + list);


       //Get Iterator
       Iterator<Integer> li=list.iterator();
       System.out.print("Itreator: ");
       while (li.hasNext()) {
        System.out.print(li.next()+" ");
       }
       System.out.println();

       Collections.shuffle(list);
       System.out.println("Shuffled list 1: "+list);


       //Display Randomized List
       li=list.iterator();
       System.out.println("display randomized Shuffled List: "+li);


       while (li.hasNext()) {
        System.out.print("list 2: "+li.next()+ " ");
       }
       System.out.println();

       System.out.println("Minimum: "+Collections.min(list));
       System.out.println("Maximum: "+Collections.max( list));



       //

       

    }

      
}
