package collection;

import java.util.*;

public class MySet {
    public static void main(String[] args) {
        System.out.println("HashSet---------------------------");
        HashSet<String> hashSet = new HashSet();
        hashSet.add("Sadab");
        hashSet.add("Shabreen");
        hashSet.add("Younus");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(hashSet.contains("Younus"));
        System.out.println(hashSet.size());
        hashSet.remove("Younus");
        System.out.println(hashSet.contains("Younus"));
        System.out.println(hashSet.size());
        Object[] names = hashSet.toArray();
        for(Object name: names){
            System.out.println(name);
        }

        System.out.println("LinkedHashSet-----------");
        LinkedHashSet linkedHashSet = new LinkedHashSet(hashSet);
        iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("TreeSet ---------------------------- ");
        TreeSet treeSet = new TreeSet(hashSet);
        System.out.println(treeSet.first());
    }
}