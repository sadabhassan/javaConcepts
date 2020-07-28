package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MyQueue {
    public static void main(String[] args) {
        System.out.println("priority queue------------------");
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add("danish");
        priorityQueue.add("babar");
        priorityQueue.add("amit");
        priorityQueue.add("cassie");


        Iterator iterator =priorityQueue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        boolean isObjectPresent = priorityQueue.contains("Sadab");
        System.out.println(isObjectPresent);
//        priorityQueue.remove("Amit");
        System.out.println(priorityQueue.contains("Younus"));
        //priorityQueue.add(123456789);// this will throw exception
        System.out.println(priorityQueue.peek());
//        priorityQueue.remove("babar");
        priorityQueue.poll();
        iterator = priorityQueue.iterator();
        while(iterator.hasNext()){
            System.out.println("---------------------------");
            System.out.println(iterator.next());
        }
    }
}