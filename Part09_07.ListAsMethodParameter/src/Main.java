import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
        
        List<String> strings = new ArrayList<>();
        strings.add("string objects inside an arraylist object!");

        List<String> strings2 = new LinkedList<>();
        strings2.add("string objects inside a linkedlist object!");
                
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> list){
        return list.size();
    }
}

