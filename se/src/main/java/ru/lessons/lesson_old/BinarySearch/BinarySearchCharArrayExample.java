/*
  Performing Binary Search on Java char Array Example
  This java example shows how to perform binary search for an element 
  of java char array using Arrays class. 
*/
 
import java.util.Arrays;
 
public class BinarySearchCharArrayExample {
 
  public static void main(String[] args) {
    //create char array
    char charArray[] = {'a','b','d','e'};
   
    /*
      To perform binary search on char array use
      int binarySearch(char[] b, char value) of Arrays class. This method searches
      the char array for specified char value using binary search algorithm.
     
      Please note that the char array MUST BE SORTED before it can be searched
      using binarySearch method.
     
      This method returns the index of the value to be searched, if found in the
      array.
      Otherwise it returns (- (X) - 1)
      where X is the index where the the search value would be inserted.
      i.e. index of first element that is grater than the search 
      value or array.length, if all elements of an array are less 
      than the search value.
    */
   
    //sort char array using Arrays.sort method
    Arrays.sort(charArray);
   
    //value to search
    char searchValue = 'b';
   
    //since 'b' is present in char array, index of it would be returned
    int intResult = Arrays.binarySearch(charArray,searchValue);
    System.out.println("Result of binary search of 'b' is : " + intResult);
   
    //lets search something which is not in char array !
    searchValue = 'c';
    intResult = Arrays.binarySearch(charArray,searchValue);
    System.out.println("Result of binary search of 'c' is : " + intResult);
  
  }
}
 
/*
Output would be
Result of binary search of 'b' is : 1
Result of binary search of 'c' is : -3
*/