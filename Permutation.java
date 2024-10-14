import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Permutation{
    //Method to generate all permutations of String

    public static List<String> getPermutations(String str){
        List<String> result=new ArrayList<>();
        permute(str, 0,str.length()-1, result);
        return result;
    }
    
    //Helper method to generate all the permutations
        private static void permute(String str, Integer left, Integer right, List<String> result){
            if (left == right){
                result.add(str);
            }else{
                for(Integer i=left; i<=right;i++){
                    str= swap(str, left, i);
                    permute(str, left+1, right, result);
                    str= swap(str,left,i);//backtrack
                }
            }
        }
    //Helper methods to swap characters at position i and jin a string
    public static String swap(String str, Integer i, Integer j){
        char[] charArray= str.toCharArray();
        char temp= charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner scn=new Scanner(System.in);
        String value= scn.next();
        System.out.println("The Permutation of a String: "+getPermutations(value));
        System.out.println("Count of the permutation Strings: "+getPermutations(value).size());

    }

}