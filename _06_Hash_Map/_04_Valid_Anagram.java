
import java.util.HashMap;
import java.util.Set;

public class _04_Valid_Anagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < b.length(); i++) {
            char ch1 = b.charAt(i);
            {
                if (map.get(ch1) != null) {
                    if (map.get(ch1) == 1) {
                        map.remove(ch1);
                    } else {
                        map.put(ch1, map.get(ch1) - 1);
                    }
                } else {
                    return false;
                }
            }
        }
        return map.isEmpty();

    }

    public static void main(String args[]) {
        String a = "tulip";
        String b = "liput";
        System.out.print(isAnagram(a, b));
    }

}