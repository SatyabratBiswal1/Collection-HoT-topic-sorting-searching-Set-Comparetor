package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaxSearch {

	public static void main(String[] args) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 list.add(15);
		 list.add(20);
		 list.add(10);
		Integer max = Collections.max(list);
		 
		System.out.println("Max number in list:: " + max);
		
		Integer min = Collections.min(list);
		 
		System.out.println("Mini number in list:: " + min);
		
		// list of Strings the String having the most number of letters

		ArrayList<String> s1=new ArrayList<String>();
        s1.add("satya");  
        s1.add("ab");  
        s1.add("satyabratBiswal");
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        
        String max1 = Collections.max(s1, comparator);
         
        System.out.println("Most-letter  name: " + max1);
        
        String min1 = Collections.min(s1,comparator);
        
        System.out.println("Minimum letter: " + min1);
	}

}
