/*
  Iterate through elements of Java TreeSet example
  This Java Example shows how to iterate through elements Java TreeSet object.
*/
 
import java.util.TreeSet;
import java.util.Iterator;
 
public class IterateThroughElementsOfTreeSetExample {
 
  public static void main(String[] args) {
 
    //create object of TreeSet
    TreeSet tSet = new TreeSet();
   
    //add elements to TreeSet object
    tSet.add(new Integer("1"));
    tSet.add(new Integer("2"));
    tSet.add(new Integer("3"));
   
    //get the Iterator
    Iterator itr = tSet.iterator();
   
    System.out.println("TreeSet contains : ");
    while(itr.hasNext())
      System.out.println(itr.next());
  }
}
 
/*
Output would be
TreeSet contains :
1
2
3
*/