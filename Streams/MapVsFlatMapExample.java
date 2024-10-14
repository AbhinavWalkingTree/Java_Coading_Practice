package Streams;

import java.util.Arrays;
import java.util.List;

public class MapVsFlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfInteger=Arrays.asList(
            Arrays.asList(1,23,4,5,3,1),
            Arrays.asList(1,6,7,8,8,5,4),
            Arrays.asList(9,6,7,5,4,3,2,34,5,3)
        );


        // for map only
        listOfInteger.stream().map(List::size)
        .forEach(System.out::print);

        System.out.println("\n ");
        // For the Flatemap
        listOfInteger.stream().flatMap(List::stream)
        .forEach(System.out::print);
    }
}
