package Searching;

import java.util.ArrayList;
import java.util.Collections;

public class indexOfSubList {
	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	 list.add(15);
	 list.add(20);
	 list.add(45);
	 list.add(25);
	 list.add(40);
	 list.add(80);
	 
	 ArrayList<Integer> list1=new ArrayList<Integer>();
	 list1.add(25);
	 list1.add(40);
	 list1.add(80);
	 
	/* returns the starting position of the first occurrence 
	 * of the specified target list
	 * within the specified source list*/
	 
	 int startingIndex = Collections.indexOfSubList(list,list1);
	 
	 System.out.println("Starting position: " + startingIndex);


}
}