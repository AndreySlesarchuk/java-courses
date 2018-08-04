/*
  Check if a particular value exists in Java TreeSet example
  This Java Example shows how to check if TreeSet object contains a particular
  value using contains method of TreeSet class.
*/
 
import java.util.TreeSet;
 
public class CheckValueOfTreeSetExample {
 
  public static void main(String[] args) {
   
    //create TreeSet object
    TreeSet tSet = new TreeSet();
   
    //add elements to TreeSet
    tSet.add("1");
    tSet.add("3");
    tSet.add("2");
    tSet.add("5");
    tSet.add("4");
   
    /*
      To check whether a particular value exists in TreeSet use
      boolean contains(Object value) method of TreeSet class.
      It returns true if the TreeSet contains the value, otherwise false.
    */
   
    boolean blnExists = tSet.contains("3");
    System.out.println("3 exists in TreeSet ? : " + blnExists);
  }
}
 
/*
Output would be
3 exists in TreeSet ? : true
*/