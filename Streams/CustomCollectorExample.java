package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
public class CustomCollectorExample {
    // Create custom Collectors methods
    public static Collector<String, StringBuilder, String> joiningWithDelimiters(String delimiter,String prefix, String sufix){

        return Collector.of(
                StringBuilder::new,
                (sb,s)->{
                    if  (sb.length()>0) sb.append(delimiter);
                    sb.append(s);
                },
                StringBuilder::append,
                sb->prefix + sb.toString() +sufix
        );
    }
    public static void main(String args[]){

        List<Integer> number= Arrays.asList(1,2,3,43,34,5,34,2,2,1,12,2,1);
        int sum=number
                .stream().mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: "+ sum);
    }
}
