package SynchronizationTest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator; 
  
public class FailSafeItr { 
    public static void main(String[] args) 
    {  
        ConcurrentHashMap<String, Integer> map 
            = new ConcurrentHashMap<String, Integer>(); 
    //	HashMap <String,Integer> map=new HashMap<String,Integer>();
  
        map.put("ONE", 1); 
        map.put("TWO", 2); 
        map.put("THREE", 3); 
        map.put("FOUR", 4); 
  
        // Getting an Iterator from map 
        Iterator it = map.keySet().iterator(); 
  
        while (it.hasNext()) { 
            String key = (String)it.next(); 
            System.out.println(key + " : " + map.get(key)); 
  
            // This will reflect in iterator. 
            // Hence, it has not created separate copy 
            map.put("SEVEN", 7); 
        } 
    } 
} 