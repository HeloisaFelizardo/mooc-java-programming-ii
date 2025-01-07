package limitednumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> inputs = new ArrayList<>();

		while (true) {
			Integer row = scanner.nextInt();
			if (row <= 0) {
				break;
			}

			inputs.add(row);
		}

		inputs.stream().filter(number -> number >= 1 && number <= 5).forEach(number -> System.out.println(number));

		scanner.close();
	}
}
