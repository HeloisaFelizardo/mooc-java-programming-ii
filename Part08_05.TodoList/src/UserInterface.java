
import java.util.Scanner;

public class UserInterface {
    final private TodoList list;
    final private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        OUTER:
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    System.out.println("Bye bye!");
                    break OUTER;
                case "add": {
                    System.out.println("To add: ");
                    String task = scanner.nextLine();                    
                    list.add(task);
                    break;
                }
                case "list": {
                    list.print();                   
                    break;
                }
                case "remove": {
                    System.out.println("Which one is removed? ");
                    int index = Integer.valueOf(scanner.nextLine());
                    list.remove(index);
                    break;
                }
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
