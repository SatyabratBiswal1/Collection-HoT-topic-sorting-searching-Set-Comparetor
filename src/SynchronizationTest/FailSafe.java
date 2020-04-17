package SynchronizationTest;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Iterator; 
  
public class FailSafe { 
    public static void main(String args[]) 
    { 
       ArrayList<Integer> list
           = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        
        Iterator itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer no = (Integer)itr.next(); 
            System.out.println(no); 
                list.add(14); 
        } 
    } 
} 