/*
   Java Sort float Array Example
   This example shows how to sort a float array using sort method of Arrays class of
   java.util package.
*/
 
import java.util.Arrays;
 
public class SortFloatArrayExample {
 
  public static void main(String[] args) {
   
    //create float array
    float[] f1 = new float[]{3f,2f,5f,4f,1f};
   
    //print original float array
    System.out.print("Original Array :t ");
    for(int index=0; index < f1.length ; index++)
      System.out.print("  "  + f1[index]);
   
    /*
     To sort java float array use Arrays.sort() method of java.util package.
     Sort method sorts float array in ascending order and based on quicksort
     algorithm.
     There are two static sort methods available in java.util.Arrays class
     to sort a float array.
    */
   
    //To sort full array use sort(float[] f) method.
    Arrays.sort(f1);
   
    //print sorted float array
    System.out.print("nSorted float array :t ");
    for(int index=0; index < f1.length ; index++)
      System.out.print("  "  + f1[index]);
     
    /*
      To sort partial float array use
      sort(float[] f, int startIndex, int endIndex) method where startIndex is
      inclusive and endIndex is exclusive
    */
   
    float[] f2 = new float[]{5f,2f,3f,1f,4f};
    Arrays.sort(f2,1,4);
   
    //print sorted float array
    System.out.print("nPartially Sorted float array :t ");
    for(int index=0; index < f2.length ; index++)
      System.out.print("  "  + f2[index]);
 
  } 
}
 
/*
Output Would be
 
Original Array :     3.0  2.0  5.0  4.0  1.0
Sorted float array :     1.0  2.0  3.0  4.0  5.0
Partially Sorted float array :     5.0  1.0  2.0  3.0  4.0
*/