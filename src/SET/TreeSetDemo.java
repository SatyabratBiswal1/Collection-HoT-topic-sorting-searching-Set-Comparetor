package SET;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("zyan");
		ts.add("satya");
		ts.add("ram");
		ts.add("amit");
		ts.add("madhu");
		ts.add("shyam");
		ts.add("zyan");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println("initial tree set::" +it.next());
		}
		
		Iterator ir=ts.descendingIterator();
		while(ir.hasNext())
		{
			System.out.println("in descending order::" +ir.next());
		}
		
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(24);  
        set.add(66);  
        set.add(12);  
        set.add(15);  
        
        System.out.println("initial tree set::" +set);
        System.out.println("First Lowest Value: "+set.pollFirst());  
        System.out.println("Last Highest Value: "+set.pollLast());  
        
	}

}
