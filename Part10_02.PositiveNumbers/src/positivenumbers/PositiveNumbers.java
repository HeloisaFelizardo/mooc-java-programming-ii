package positivenumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> inputs = new ArrayList<>();

		while (true) {
			String row = scanner.nextLine();
			if (row.equals("end")) {
				break;
			}
			inputs.add(row);
		}

		// Convertendo String para Numeros
		List<Integer> numbers = inputs.stream().map(Integer::valueOf).collect(Collectors.toList());

		// Obtendo apenas os numeros positivos
		List<Integer> positiveNumbers = positive(numbers);

		System.out.println("Números positivos: " + positiveNumbers);

		scanner.close();
	}

	public static List<Integer> positive(List<Integer> numbers) {
		return numbers.stream().filter(number -> number > 0).collect(Collectors.toCollection(ArrayList::new));
	};
}
