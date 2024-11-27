
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        while(true){         
            String input = String.valueOf(scanner.nextLine());
            
            if(input.equals("end")){
                break;
            }
            
            int number = Integer.valueOf(input);
            
            int result = number * number * number;
            
            System.out.println(result);
            
        }
        scanner.close();
    }
}
