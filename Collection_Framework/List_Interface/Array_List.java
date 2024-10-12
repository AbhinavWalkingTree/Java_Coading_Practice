package Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections; 

/*
 * Java Program to demonstrate the Array List
 */
public class Array_List {
    
    public static void main(String[] args) {
        //Declare the Array List  or
         // Create an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<Integer>(); //Used Default Constructor 

       
        //To add the Elements in Array List, using add() method
         //Add Items in the end of the list
        list.add(3);
        list.add(2);
        list.add(-2);
        list.add(900);
        list.add(-234);
        list.add(101);
        System.out.println("Item added in end of the List :"+list);

         //Add Items in the specific index  of the list
         list.add(5, 0);
         list.add(1, 121);
         list.add(4, 0);
         System.out.println("Item added in the specific index 5,1,4 of the list: "+list);
       
       
         //Access an Item
        //To access an element in the array list, using get() method and Refer to the Index Number
        int el1=list.get(0);
        int el2=list.get(1);
        int el3=list.get(2);
        System.out.printf("Element 1=%d\nElement 2=%d\nElement 3=%d \n",el1,el2,el3);

        //Change an Item
        //To modify an Element, use the Set() method and refer to the index number:
        list.set(0, 100);
        System.out.println("Modify List: "+list);

        //Remove an Item
        //To remove an Element, use the  remove() method and refer to the index number:
        list.remove(2);
        System.out.println("Remove List"+list);

        //Remove First Occurence of element
        list.remove('0');
        System.out.println("Remove the first occurence of List: "+list);

         // Checking if an element exists
         //To remove an Element, use the  list.contains() method and refer to the list element:
         Boolean containe100=list.contains(100);
         System.out.println("Check if list containe Element 100: "+containe100);
        

        // Appends all elements from a collection
          Arrays.asList(121,131);
        list.addAll(list);

         // Inserts all elements from a collection at a specific position
        Arrays.asList(101,102,103);
        list.addAll(3, list);

        // Checking if the list is empty
        System.out.println("Is the List Empty? "+list.isEmpty());
        

         // Create an ArrayList of Strings
         ArrayList<String> myList = new ArrayList<>();

         // Adding elements to the ArrayList
         myList.add("Apple");
         myList.add("Banana");
         myList.add("Cherry");
         myList.add("Date");
         System.out.println("List Of String: "+myList);
        // Finding the index of an element
        int indexList=myList.indexOf("Banana");
        System.out.println("Index of 'Banana' :"+indexList);
        // Finding the Last index of an element
        indexList=myList.lastIndexOf("Apple");
        System.out.println("Last Index of 'Apple': "+indexList);

        //Remove all Element that Match a Predecate
        myList.removeIf(fruit->fruit.startsWith("A"));
        System.out.println("Remove Element if it starts with 'P': "+myList);

        //Replacing All occurrences of an element
        myList.replaceAll(fruit->fruit.toUpperCase());
        System.out.println("Replace all element to Upper Case: "+myList);


        //Sorting The List
         Collections.sort(list);
         System.out.println("Sort list: "  + list);

         //Converting the List to an Array
         Integer[] array=list.toArray(new Integer[0]);
         System.out.println("Convert the Array list in Array: "+Arrays.toString(array));

         //ArrayList Size
        //To find out how many elements an ArrayList have, use the size method:
        int size=list.size();
        System.out.println("Size of List: "+size);

        //Loop Through an ArrayList
        //Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index "+i+" :"+list.get(i));

        }

        //Method to Remove all the elements in the ArrayList, use the clear() method:
        list.clear();
        System.out.println(" Clear List :"+list);


          // Checking if the list is empty
          System.out.println("Is the List Empty? "+list.isEmpty());
        
    }
}
