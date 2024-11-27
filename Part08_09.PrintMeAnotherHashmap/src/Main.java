
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for(Book value: hashmap.values()){
            System.out.println(value);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for(Book value: hashmap.values()){
            if(value.getName().contains(text.toLowerCase().trim())){
                System.out.println(value);
            }
        }
    }

    
}
