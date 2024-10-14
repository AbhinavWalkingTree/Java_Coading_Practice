package Streams;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Streams {
    /*
     * filter a list of numbers
     * to find the even numbers and calculate their sum using
     * the Stream API.
     */
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        Integer num = scn.nextInt();
        
        // Create a list and add elements
        List<Integer> numList = new ArrayList<>();
        System.out.println("Enter " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            numList.add(scn.nextInt());
        }
        List<Integer> listOfEven= numList.stream().
        filter(n -> n%2==0)
        .collect(Collectors.toList());

        Integer sumOfEven=listOfEven.stream()
                            .mapToInt(Integer::intValue)// filter(Integer::intValue)
                            .sum();
        System.out.println("List of Even number: "+listOfEven);
        System.out.println("Sum of Even Number: " +sumOfEven);
    }
}
