import java.util.*;  

// Iterating ArrayList using Iterator
// Iterating through an ArrayList using an Iterator in Java is a common operation that allows you to traverse the list's elements sequentially. Iterators provide a safe and efficient way to access elements in a collection, especially when you want to perform operations like removing elements during iteration. Let's see an example of traversing ArrayList elements using the Iterator interface.

public class ArrayListByIterator{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Mango");//Adding object in arraylist    
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  //Traversing list through Iterator  
  Iterator itr=list.iterator();//getting the Iterator  
  while(itr.hasNext()){//check if iterator has the elements  
   System.out.println(itr.next());//printing the element and move to next  
  }  
 }  
}  