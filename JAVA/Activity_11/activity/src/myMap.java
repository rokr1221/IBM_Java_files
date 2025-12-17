import java.util.HashMap;
import java.util.Map;

public class myMap {
    public static void main(String[] args) {
        Map<Integer, String> map  = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "B;ack");
        map.put(3, "White");
        map.put(4, "Orange");
        map.put(5, "Green");


        System.out.println(map.entrySet());
        
        map.remove(1);
        System.out.println("First Item Remmoved");

        System.out.println(map.entrySet());

        System.out.println("Green exists or not : "+ map.containsValue("Green"));

        System.out.println("Size of Map : "+ map.size());
    }
}
