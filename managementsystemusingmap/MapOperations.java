
package managementsystemusingmap;

import java.util.HashMap;
import java.util.*;

public class MapOperations <K,V>
{
     HashMap<K, V> map;

    MapOperations(HashMap<K, V> map) {
        this.map = map;
    }

    
    void add(K key, V value) {
        map.put(key, value);
        System.out.println("Added Successfully");
    }

   
    void search(K key) {
        if (map.containsKey(key)) {
            System.out.println("Value : " + map.get(key));
        } else {
            System.out.println("Key Not Found");
        }
    }

   
   void update(K key, V value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Key Not Found");
        }
    }

    
    void delete(K key) {
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Key Not Found");
        }
    }

    
    void display() {
        if (map.isEmpty()) {
            System.out.println("No Data");
        } else {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

