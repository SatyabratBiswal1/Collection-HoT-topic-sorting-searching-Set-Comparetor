package SET;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAddElements {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("satya");
		hs.add("ram");
		hs.add("shyam");
		hs.add("sita");
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
			System.out.println("initial hashset::" +it.next());
		
		/*for(String e:hs)
				System.out.println("after removing satya:"+e);*/
		
		hs.removeIf(s->s.contains("mita"));
				System.out.println("after removing mita:"+hs);
				
				
		hs.remove("satya");
		
		hs.forEach(a->{
			{
				System.out.println("after removing satya::"+a);
			}

			});
		
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("a");
		hs1.add("b");
		hs1.add("c");
		hs1.add("d");
		hs1.removeAll(hs1);
		//hs1.clear();

		System.out.println(hs1);
	}

}

