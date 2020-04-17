package SynchronizationTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedWrapper {

	public static void main(String[] args) {
		List<String> s = Collections.synchronizedList(new ArrayList<>());
		s.add("satya");
		s.add("Raj");
		s.add("nana");
		 
		Iterator<String> iterator = s.iterator();
		 
		synchronized (s) {
		    /*while (iterator.hasNext()) {
		        String next = iterator.next();
		        
		        System.out.println(next);
		        s.add("sam");
		    }*/
			for(String a:s)
				System.out.println(a);
			s.add("h");
		}
		}

	}
