package SynchronizationTest;

import java.io.*; 
import java.util.Iterator; 
import java.util.concurrent.CopyOnWriteArrayList; 
  
public class CopyWriter {
	    public static void main (String[] args) 
	    {  
	        CopyOnWriteArrayList<String> al 
	            = new CopyOnWriteArrayList<String>();
	        al.add("ram"); 
	        al.add("sam"); 
	        al.add("raghu"); 
	        System.out.println("synchronized ArrayList :");  
	        Iterator<String> it = al.iterator(); 
	        while (it.hasNext()) 
	            System.out.println(it.next()); 
	    } 
	} 
	