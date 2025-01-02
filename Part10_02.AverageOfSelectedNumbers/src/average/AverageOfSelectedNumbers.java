package average;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> inputs = new ArrayList<>();

		System.out.println("Input numbers, type \\\"end\\\" to stop.");

		while (true) {
			String row = scanner.nextLine();
			if (row.equals("end")) {
				break;
			}

			inputs.add(row);
		}

		double averageNegative = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(number -> number < 0)
				.average().getAsDouble();

		double averagePositive = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(number -> number > 0)
				.average().getAsDouble();

		System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

		String option = scanner.nextLine();

		if (option.equals("n")) {
			System.out.println("average of the numbers: " + averageNegative);
		}

		if (option.equals("p")) {
			System.out.println("average of the numbers: " + averagePositive);
		}
		
		scanner.close();
	}
}
