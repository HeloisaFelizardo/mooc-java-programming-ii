package average;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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

		double average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).average().getAsDouble();

		System.out.println("average of the numbers: " + average);
	}
}
