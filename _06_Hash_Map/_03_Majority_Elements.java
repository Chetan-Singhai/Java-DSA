import java.util.HashMap;
import java.util.Set;

public class _03_Majority_Elements {
    public static int mojEle(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }

             map.put(arr[i],map.getOrDefault(arr[i], 0)+1 );

            // Set<Integer>getKey= map.keySet();
            for (int keySet : map.keySet()) {
                if (map.get(keySet) >= arr.length / 2) {
                          return keySet;
                }
            }
        } return -1;
    }
        public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
           System.out.println(mojEle(arr));         


    }

}