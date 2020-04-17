package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {
	
	public static void main(String[] args) 
    {  
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("D"); 
        al.add("Z"); 
        al.add("C"); 
        al.add("A"); 
        al.add("B"); 
        
        Collections.sort(al); 
  
        System.out.println("List after Sorting"  + al); 
    } 
} 

