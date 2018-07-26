/*
   Java Sort int Array Example
   This example shows how to sort an int array using sort method of Arrays class of
   java.util package.
*/
 
import java.util.Arrays;
 
public class SortIntArrayExample {
 
  public static void main(String[] args) {
   
    //create an int array
    int[] i1 = new int[]{3,2,5,4,1};
   
    //print original int array
    System.out.print("Original Array : ");
    for(int index=0; index < i1.length ; index++)
      System.out.print("  "  + i1[index]);
   
    /*
     To sort java int array use Arrays.sort() method of java.util package.
     Sort method sorts int array in ascending order and based on quicksort
     algorithm.
     There are two static sort methods available in java.util.Arrays class
     to sort an int array.
    */
   
    //To sort full array use sort(int[] i) method.
    Arrays.sort(i1);
   
    //print sorted int array
    System.out.print("Sorted int array : ");
    for(int index=0; index < i1.length ; index++)
      System.out.print("  "  + i1[index]);
     
    /*
      To sort partial int array use
      sort(int[] i, int startIndex, int endIndex) method where startIndex is
      inclusive and endIndex is exclusive
    */
   
    int[] i2 = new int[]{5,2,3,1,4};
    Arrays.sort(i2,1,4);
   
    //print sorted int array
    System.out.print("Partially Sorted int array : ");
    for(int index=0; index < i2.length ; index++)
      System.out.print("  "  + i2[index]);
 
  } 
}
 
/*
Output Would be
 
Original Array :     3  2  5  4  1
Sorted int array :     1  2  3  4  5
Partially Sorted int array :     5  1  2  3  4
*/