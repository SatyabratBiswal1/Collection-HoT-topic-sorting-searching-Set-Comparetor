package SynchronizationTest;

//TESING THE TIME FACTOR BTWEEN ARRAYLIST AND VECTOR ,linked list,stack
//vector and Hashtable are the two collections exist early in Java history, and they are designed for thread-safe
import java.util.*;
public class CollectionThreadSafeTest {
 
    public void testVector() {
        long startTime = System.currentTimeMillis();
        Vector<Integer> vector = new Vector<>();
 
        for (int i = 0; i < 10_000_000; i++) {
            vector.addElement(i);
        }
 
        long endTime = System.currentTimeMillis();
 
        long totalTime = endTime - startTime;
 
        System.out.println("Test Vector: " + totalTime + " ms");
    }
    public void testArrayList() {
        long startTime = System.currentTimeMillis();
 
        List<Integer> list = new ArrayList<>();
 
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
 
        long endTime = System.currentTimeMillis();
 
        long totalTime = endTime - startTime;
 
        System.out.println("Test ArrayList: " + totalTime + " ms");
 
    }
     public static void main(String[] args) {
        CollectionThreadSafeTest c = new CollectionThreadSafeTest();
 
        c.testVector();
 
        c.testArrayList();
    }
 
}