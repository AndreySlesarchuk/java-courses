/*
  Performing Binary Search on Java long Array Example
  This java example shows how to perform binary search for an element of 
  java long array using Arrays class. 
*/
 
import java.util.Arrays;
 
public class BinarySearchLongArrayExample {
 
  public static void main(String[] args) {
    //create long array
    long longArray[] = {1,2,4,5};
   
    /*
      To perform binary search on long array use
      long binarySearch(long[] b, long value) of Arrays class. This method searches
      the long array for specified long value using binary search algorithm.
     
      Please note that the long array MUST BE SORTED before it can be searched
      using binarySearch method.
     
      This method returns the index of the value to be searched, if found in the
      array.
      Otherwise it returns (- (X) - 1)
      where X is the index where the the search value would be inserted.
      i.e. index of first element that is grater than the search value 
      or array.length, if all elements of an array are less than the 
      search value.
    */
   
    //sort long array using Arrays.sort method
    Arrays.sort(longArray);
   
    //value to search
    long searchValue = 2;
   
    //since 2 is present in long array, index of it would be returned
    long intResult = Arrays.binarySearch(longArray,searchValue);
    System.out.println("Result of binary search of 2 is : " + intResult);
   
    //lets search something which is not in long array !
    searchValue = 3;
    intResult = Arrays.binarySearch(longArray,searchValue);
    System.out.println("Result of binary search of 3 is : " + intResult);
  
  }
}
 
/*
Output would be
Result of binary search of 2 is : 1
Result of binary search of 3 is : -3
*/