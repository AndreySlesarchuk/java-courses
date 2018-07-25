/*
  Performing Binary Search on Java double Array Example
  This java example shows how to perform binary search for an element of 
  java double array using Arrays class. 
*/
 
import java.util.Arrays;
 
public class BinarySearchDoubleArrayExample {
 
  public static void main(String[] args) {
    //create double array
    double doubleArray[] = {1.23,2.10,4.74,5.34};
   
    /*
      To perform binary search on double array use
      int binarySearch(double[] b, double value) of Arrays class. 
      This method searches the double array for specified double value 
      using binary search algorithm.
     
      Please note that the double array MUST BE SORTED before it can be searched
      using binarySearch method.
     
      This method returns the index of the value to be searched, if found in the
      array.
      Otherwise it returns (- (X) - 1)
      where X is the index where the the search value would be inserted.
      i.e. index of first element that is grater than the search value 
      or array.length, if all elements of an array are less than the 
      search value.
    */
   
    //sort double array using Arrays.sort method
    Arrays.sort(doubleArray);
   
    //value to search
    double searchValue = 4.74;
   
    //since 4.74 is present in double array, index of it would be returned
    int intResult = Arrays.binarySearch(doubleArray,searchValue);
    System.out.println("Result of binary search of 4.74 is : " + intResult);
   
    //lets search something which is not in double array !
    searchValue = 3.33;
    intResult = Arrays.binarySearch(doubleArray,searchValue);
    System.out.println("Result of binary search of 3.33 is : " + intResult);
  
  }
}
 
/*
Output would be
Result of binary search of 4.74 is : 2
Result of binary search of 3.33 is : -3
*/