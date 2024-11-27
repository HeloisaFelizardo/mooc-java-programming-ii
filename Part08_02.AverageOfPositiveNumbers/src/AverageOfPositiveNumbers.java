
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int input = scanner.nextInt();
            
            if (input == 0) {        
                break;
            }

            if (input > 0) {
                sum += input;
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average.");
        }
        scanner.close();        
    }
}
