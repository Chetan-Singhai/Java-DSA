
import java.util.Scanner;
import java.util.HashMap;
//import java.util.HashMap.entrySet();
import java.util.Set;

public class _02_Itration_On_Hash_Map {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)

        hm.put("India", 100);
        hm.put("China", 90);
        hm.put("Pak", 80);
        hm.put("Uk", 70);

        System.out.println(hm);

          // Iterate

         Set<String>Key = hm.keySet(); 
           System.out.println(Key); 
         for(String k :Key){
            System.out.println(" Key = " + k + ",Value = " + hm.get(k));
         }

           // entrySet
           for(HashMap.Entry<String , Integer> k : hm.entrySet())
             System.out.printf("Add of %s is %d \n" ,k.getKey(),k.getValue());
    }
}