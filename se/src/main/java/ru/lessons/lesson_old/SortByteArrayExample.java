/*
   Java Sort byte Array Example
   This example shows how to sort a byte array using sort method of Arrays class of
   java.util package.
*/
 
import java.util.Arrays;
 
public class SortByteArrayExample {
 
  public static void main(String[] args) {
   
    //create byte array
    byte[] b1 = new byte[]{3,2,5,4,1};
   
    //print original byte array
    System.out.print("Original Array :t ");
    for(int index=0; index < b1.length ; index++)
      System.out.print("  "  + b1[index]);
   
    /*
     To sort java byte array use Arrays.sort() method of java.util package.
     Sort method sorts byte array in ascending order and based on quicksort
     algorithm.
     There are two static sort methods available in java.util.Arrays class
     to sort a byte array.
    */
   
    //To sort full array use sort(byte[] b) method.
    Arrays.sort(b1);
   
    //print sorted byte array
    System.out.print("nSorted byte array :t ");
    for(int index=0; index < b1.length ; index++)
      System.out.print("  "  + b1[index]);
     
    /*
      To sort partial byte array use
      sort(byte[] b, int startIndex, int endIndex) method where startIndex is
      inclusive and endIndex is exclusive
    */
   
    byte[] b2 = new byte[]{5,2,3,1,4};
    Arrays.sort(b2,1,4);
   
    //print sorted byte array
    System.out.print("nPartially Sorted byte array :t ");
    for(int index=0; index < b2.length ; index++)
      System.out.print("  "  + b2[index]);
 
  } 
}
 
/*
Output Would be
 
Original Array :     3  2  5  4  1
Sorted byte array :     1  2  3  4  5
Partially Sorted byte array :     5  1  2  3  4
*/