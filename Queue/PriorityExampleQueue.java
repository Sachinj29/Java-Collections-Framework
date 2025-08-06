
import java.util.*;    


class PriorityExampleQueue {    
    public static void main(String args[]) {    
        // Creating a PriorityQueue of Strings  
        PriorityQueue<String> queue = new PriorityQueue<String>();    
        // Adding elements to the PriorityQueue  
        queue.add("Amit");    
        queue.add("Vijay");    
        queue.add("Karan");    
        queue.add("Jai");    
        queue.add("Rahul");    
        // Displaying the head of the queue using element() method  
        // This method throws an exception if the queue is empty  
        System.out.println("head:" + queue.element());    
        // Displaying the head of the queue using peek() method  
        // This method returns null if the queue is empty  
        System.out.println("head:" + queue.peek());    
        // Iterating through the queue elements  
        System.out.println("iterating the queue elements:");    
        Iterator<String> itr = queue.iterator();    
        while (itr.hasNext()) {    
            System.out.println(itr.next());    
        }    
        // Removing the head of the queue using remove() method  
        // This method throws an exception if the queue is empty  
        queue.remove();    
        // Removing the head of the queue using poll() method  
        // This method returns null if the queue is empty  
        queue.poll();    
        // Displaying the queue elements after removing two elements  
        System.out.println("after removing two elements:");    
        Iterator<String> itr2 = queue.iterator();    
        while (itr2.hasNext()) {    
            System.out.println(itr2.next());    
        }    
    }    
}