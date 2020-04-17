package Searching;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo {
	public static void main(String[] args) 
    { 
        ArrayList <Integer>al = new ArrayList<Integer>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(10); 
        al.add(20); 
        int index = Collections.binarySearch(al, 10); 
        System.out.println("position is::"+index); 
  
        // 21 is not present. 22 would have been inserted 
        // at position 4. So the function returns (-5-1)  
        // which is -6. 
        index = Collections.binarySearch(al, 21); 
        System.out.println("position is::"+index); 
        
    } 
} 
