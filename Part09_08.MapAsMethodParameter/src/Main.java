import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        for (String key : names.keySet()) {
            System.out.println(key + ": " + names.get(key));
        }
        
        System.out.println(returnSize(names));

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map<String, String> map){
        return map.size();
    }
}
