package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDes {
	
	public static void main(String[] args) 
    { 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("A"); 
        al.add("B"); 
        al.add("E"); 
        al.add("C"); 
        al.add("D"); 
 
        Collections.sort(al, Collections.reverseOrder()); 
  
        System.out.println("List after sorting" +  al); 
    } 
} 

