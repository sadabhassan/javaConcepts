package collection;

import java.util.*;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Sadab");
        list.add("Shabreen");
        list.add("Younus");
        boolean isEmpty = list.isEmpty();
        System.out.println("ArrayList---------");
        System.out.println("isEmpty---" + isEmpty);
        for (String name: list) {
            System.out.println(name);
        }
        System.out.println(list.contains("Sadab"));
        System.out.println(list.get(0));
        System.out.println(list.hashCode());
//        System.out.println(list.remove("Younus"));
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator iterator1 = list.listIterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        LinkedList list1 = new LinkedList(list);
        list1.add("Prince");
        System.out.println("LinkedList---------------------");
        ListIterator iterator2 = list1.listIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        while(iterator2.hasPrevious()){
            System.out.println("Its working########################################");
            System.out.println(iterator2.previous());
        }

        //vector
        Vector vector = new Vector(list);
        vector.add(123456);
        System.out.println("vector---------------------");
        iterator2 = vector.listIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("--->" + vector.size());
        System.out.println(vector.get(3));

        // Stack
        System.out.println("stack ------------------------------------------------");
        Stack stack = new Stack();
        stack.push("Sadab");
        stack.push("Shabreen");
        stack.push(1234566789);
        ListIterator iterator3 = stack.listIterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        System.out.println(stack.peek());
        System.out.println(stack.search("Sadab"));
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.contains("Sadab"));
        System.out.println(stack.empty());
        stack.clear();
        System.out.println(stack.empty());
    }
}
