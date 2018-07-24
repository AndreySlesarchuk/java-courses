/*
   Java Sort long Array Example
   This example shows how to sort a long array using sort method of Arrays class of
   java.util package.
*/
 
import java.util.Arrays;
 
public class SortLongArrayExample {
 
  public static void main(String[] args) {
   
    //create long array
    long[] l1 = new long[]{3,2,5,4,1};
   
    //print original long array
    System.out.print("Original Array :t ");
    for(int index=0; index < l1.length ; index++)
      System.out.print("  "  + l1[index]);
   
    /*
     To sort java long array use Arrays.sort() method of java.util package.
     Sort method sorts long array in ascending order and based on quicksort
     algorithm.
     There are two static sort methods available in java.util.Arrays class
     to sort a long array.
    */
   
    //To sort full array use sort(long[] l) method.
    Arrays.sort(l1);
   
    //print sorted long array
    System.out.print("nSorted long array :t ");
    for(int index=0; index < l1.length ; index++)
      System.out.print("  "  + l1[index]);
     
    /*
      To sort partial long array use
      sort(long[] l, int startIndex, int endIndex) method where startIndex is
      inclusive and endIndex is exclusive
    */
   
    long[] l2 = new long[]{5,2,3,1,4};
    Arrays.sort(l2,1,4);
   
    //print sorted long array
    System.out.print("nPartially Sorted long array :t ");
    for(int index=0; index < l2.length ; index++)
      System.out.print("  "  + l2[index]);
 
  } 
}
 
/*
Output Would be
 
Original Array :     3  2  5  4  1
Sorted long array :     1  2  3  4  5
Partially Sorted long array :     5  1  2  3  4
*/