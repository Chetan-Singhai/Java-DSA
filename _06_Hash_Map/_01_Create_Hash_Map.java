import java.util.Scanner;
import java.util.HashMap;

public class _01_Create_Hash_Map {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)

        hm.put("India", 100);
        hm.put("China", 90);
        hm.put("Pak", 80);
        hm.put("Uk", 70);

        System.out.println(hm);

        // // GetKey - O(1)
        // int value = hm.get("India");
        // System.out.println(value);

        // // ContainsKey - O(1)

        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("Russia")); // false

        // Remove - O(1)

        // System.out.println(hm.remove("India"));
        // System.out.println(hm.remove("Russia"));
        
        // System.out.print(hm);

          // Size
        System.out.println(hm.size());
         
        // Is Empty
        System.out.println(hm.isEmpty());

    }
}