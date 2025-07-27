
import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("orange", 5);
        map.put("apple", 10);
        map.put("pineapple", 2);
        map.put("banana", 24);
        
        System.out.println(map);
        System.out.println(map.get("banana"));
    }
}
