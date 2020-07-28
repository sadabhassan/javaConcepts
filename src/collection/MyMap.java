package collection;

import java.util.HashMap;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("Shabreen", "beautiful");
        hashMap.put("Sadab", "Aggressive");
        hashMap.put("Younus", "Overthnker");

        System.out.println(hashMap.get("Sadab"));

        // to print all the objects, we have 2 ways
        // 1st way
        Set<String> keys = hashMap.keySet();
        for(String key: keys){
            System.out.println("key is " + key + " value is " + hashMap.get(key));
        }
    }
}
