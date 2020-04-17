package SynchronizationTest;

import java.util.*;
public class IteratorFailFast {
 
    private List<Integer> list = new ArrayList<>();
 
    public IteratorFailFast() {
        for (int i = 0; i < 10_000; i++) {
            list.add(i);
        }
    }
 
    public void runUpdateThread() {
        Thread thread1 = new Thread(new Runnable() {
 
            public void run() {
                for (int i = 10_000; i < 20_000; i++) {
                    list.add(i);
                }
            }
        });
 
        thread1.start();
    }
 
 
    public void runIteratorThread() {
        Thread thread2 = new Thread(new Runnable() {
 
            public void run() {
                ListIterator<Integer> iterator = list.listIterator();
                while (iterator.hasNext()) {
                    Integer number = iterator.next();
                    System.out.println(number);
                }
            }
        });
 
        thread2.start();
    }
 
    public static void main(String[] args) {
        IteratorFailFast tester = new IteratorFailFast();
 
        tester.runIteratorThread();
        tester.runUpdateThread();
    }
}
