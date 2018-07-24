/*
   Java Sort double Array Example
   This example shows how to sort a double array using sort method of Arrays class of
   java.util package.
*/
 
import java.util.Arrays;
 
public class SortDoubleArrayExample {
 
  public static void main(String[] args) {
   
    //create double array
    double[] d1 = new double[]{3,2,5,4,1};
   
    //print original double array
    System.out.print("Original Array :t ");
    for(int index=0; index < d1.length ; index++)
      System.out.print("  "  + d1[index]);
   
    /*
     To sort java double array use Arrays.sort() method of java.util package.
     Sort method sorts double array in ascending order and based on quicksort
     algorithm.
     There are two static sort methods available in java.util.Arrays class
     to sort a double array.
    */
   
    //To sort full array use sort(double[] d) method.
    Arrays.sort(d1);
   
    //print sorted double array
    System.out.print("nSorted double array :t ");
    for(int index=0; index < d1.length ; index++)
      System.out.print("  "  + d1[index]);
     
    /*
      To sort partial double array use
      sort(double[] d, int startIndex, int endIndex) method where startIndex is
      inclusive and endIndex is exclusive
    */
   
    double[] d2 = new double[]{5,2,3,1,4};
    Arrays.sort(d2,1,4);
   
    //print sorted double array
    System.out.print("nPartially Sorted double array :t ");
    for(int index=0; index < d2.length ; index++)
      System.out.print("  "  + d2[index]);
 
  } 
}
 
/*
Output Would be
 
Original Array :     3.0  2.0  5.0  4.0  1.0
Sorted double array :     1.0  2.0  3.0  4.0  5.0
Partially Sorted double array :     5.0  1.0  2.0  3.0  4.0
*/