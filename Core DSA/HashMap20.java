import java.util.*;

public class HashMap20{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        System.out.println("HashMap: " + map);

        //Searching for a key in the HashMap

        if(map.containsKey(2)) {    //constainsKey() used to check 
            System.out.println("Key 2 is present in the HashMap.");
        } else {
            System.out.println("Key 2 is not present in the HashMap.");
        }

        System.out.print(map.get(3));
        System.out.print(map.get(8));
        System.out.println();

        //for(int val : arr) ---> for-each loop
        //Iteration over the HashMap using for-each loop
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Set<Integer> keys = map.keySet();
        System.out.println("using keySet() method: " + keys);

        for(Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        //Remove an entry from the HashMap
        map.remove(2);
        System.out.println("HashMap after removing key 2: " + map);
    }
}
