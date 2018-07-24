/*
   Java Sort short Array Example
   This example shows how to sort a short array using sort method of Arrays class of
   java.util package.
*/
 
import java.util.Arrays;
 
public class SortShortArrayExample {
 
  public static void main(String[] args) {
   
    //create short array
    short[] s1 = new short[]{3,2,5,4,1};
   
    //print original short array
    System.out.print("Original Array :t ");
    for(int index=0; index < s1.length ; index++)
      System.out.print("  "  + s1[index]);
   
    /*
     To sort java short array use Arrays.sort() method of java.util package.
     Sort method sorts short array in ascending order and based on quicksort
     algorithm.
     There are two static sort methods available in java.util.Arrays class
     to sort a short array.
    */
   
    //To sort full array use sort(short[] s) method.
    Arrays.sort(s1);
   
    //print sorted short array
    System.out.print("nSorted short array :t ");
    for(int index=0; index < s1.length ; index++)
      System.out.print("  "  + s1[index]);
     
    /*
      To sort partial short array use
      sort(short[] s, int startIndex, int endIndex) method where startIndex is
      inclusive and endIndex is exclusive
    */
   
    short[] s2 = new short[]{5,2,3,1,4};
    Arrays.sort(s2,1,4);
   
    //print sorted short array
    System.out.print("nPartially Sorted short array :t ");
    for(int index=0; index < s2.length ; index++)
      System.out.print("  "  + s2[index]);
 
  } 
}
 
/*
Output Would be
 
Original Array :     3  2  5  4  1
Sorted Short array :     1  2  3  4  5
Partially Sorted Short array :     5  1  2  3  4
*/