package collection;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("Shabreen", "beautiful");
        hashMap.put("Sadab", "Aggressive");
        hashMap.put("Younus", "Overthinker");

        System.out.println(hashMap.get("Sadab"));

        // to print all the objects, we have 2 ways
        // 1st way
        Set<String> keys = hashMap.keySet();
        for(String key: keys){
            System.out.println("key is " + key + " value is " + hashMap.get(key));
        }
        // 2nd way
        Set<Map.Entry<String, String>> keyValues= hashMap.entrySet();
        System.out.println("################ 2nd way #####################");
        for(Map.Entry<String, String> keyValue: keyValues){
            System.out.println("key is " + keyValue.getKey() + " value is " + keyValue.getValue());
        }

    }
}
