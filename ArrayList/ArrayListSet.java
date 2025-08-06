

// Using get() method:

// The get( ) method is used to retrieve the element at a certain index in the ArrayList.
// It takes an integer argument which specifies the element index to be brought back.
// The indexing begins with 0, which represents the initial element, and ends with size() - 1 for the last element in the ArrayList.
// Using set() method:

// The set() method is used to replace the element at a specific index in the ArrayList with a new element.
// It takes two parameters: the index of the element to replace and the new element to be placed at that index.
// The previous element at the specified index will be overwritten by the new element.



import java.util.*;  
public class ArrayListSet{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Mango");  
  al.add("Apple");  
  al.add("Banana");  
  al.add("Grapes");  
  //accessing the element    
  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
  //changing the element  
  al.set(1,"Dates");  
  //Traversing list  
  for(String fruit:al)    
    System.out.println(fruit);    
  
 }  
}  