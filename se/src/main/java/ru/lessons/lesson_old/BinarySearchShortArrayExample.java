/*
  Performing Binary Search on Java short Array Example
  This java example shows how to perform binary search for an element of 
  java short array using Arrays class. 
*/
 
import java.util.Arrays;
 
public class BinarySearchShortArrayExample {
 
  public static void main(String[] args) {
    //create short array
    short shortArray[] = {1,2,4,5};
   
    /*
      To perform binary search on short array use
      int binarySearch(short[] b, short value) of Arrays class. This method searches
      the short array for specified short value using binary search algorithm.
     
      Please note that the short array MUST BE SORTED before it can be searched
      using binarySearch method.
     
      This method returns the index of the value to be searched, if found in the
      array.
      Otherwise it returns (- (X) - 1)
      where X is the index where the the search value would be inserted.
      i.e. index of first element that is grater than the search value 
      or array.length, if all elements of an array are less than the 
      search value.
    */
   
    //sort short array using Arrays.sort method
    Arrays.sort(shortArray);
   
    //value to search
    short searchValue = 2;
   
    //since 2 is present in short array, index of it would be returned
    int intResult = Arrays.binarySearch(shortArray,searchValue);
    System.out.println("Result of binary search of 2 is : " + intResult);
   
    //lets search something which is not in short array !
    searchValue = 3;
    intResult = Arrays.binarySearch(shortArray,searchValue);
    System.out.println("Result of binary search of 3 is : " + intResult);
  
  }
}
 
/*
Output would be
Result of binary search of 2 is : 1
Result of binary search of 3 is : -3
*/