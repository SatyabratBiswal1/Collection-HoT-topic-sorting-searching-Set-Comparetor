package SET;
import java.lang.*;
import java.util.TreeSet;

public class TreeSetNavigableSetOperations {

	public static void main(String[] args) {
		 TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);  
         
         System.out.println("tree set in descinding::" +set.descendingSet());
         
         System.out.println("set Head set::" +set.headSet("C",true));
         
         System.out.println("set subset::" +set.subSet("A",false, "E",true));
         
         System.out.println("tail set::" +set.tailSet("C",false));
         
         TreeSet<String> t=new TreeSet<String>(); 
         
         t.add("A");  
         t.add("B");  
         t.add("C");  
         t.add("D");  
         t.add("E");  
         
         System.out.println("initial tree set::" +t);
         
         System.out.println("----------- SORTED SET OPERATION---------------");
         
         System.out.println("SET HEAD SET ::" +t.headSet("c",false));
         
         System.out.println("set subset::" +set.subSet("A",false, "E",false));
         
         System.out.println("tail set::" +set.tailSet("C",true));
         
         
         
         
         
	}

}
