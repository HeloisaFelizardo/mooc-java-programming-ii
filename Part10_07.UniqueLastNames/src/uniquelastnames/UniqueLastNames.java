package uniquelastnames;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Person> persons = new ArrayList<>();

		while (true) {
			System.out.println("Continue personal information input? Type \"quit\" to end:");

			String continueQ = scanner.nextLine().trim(); // Lê a entrada e remove espaços extras

			if (continueQ.equalsIgnoreCase("quit")) {
				break; // Sai do loop se o usuário digitar "quit"
			}

			System.out.println("Input first name: ");
			String firstName = scanner.nextLine().trim(); // Lê o primeiro nome e remove espaços extras

			System.out.println("Input last name: ");
			String lastName = scanner.nextLine().trim(); // Lê o sobrenome e remove espaços extras

			int birthYear = 0;
			boolean validBirthYear = false;
			while (!validBirthYear) {
				System.out.println("Input birth year (integer): ");
				try {
					birthYear = Integer.parseInt(scanner.nextLine().trim());
					validBirthYear = true; // Se a conversão for bem-sucedida, sai do loop
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid year.");
				}
			}

			persons.add(new Person(firstName, lastName, birthYear)); // Adiciona uma nova pessoa à lista

			System.out.println(""); // Linha em branco entre as entradas
		}

		// Imprime os sobrenomes únicos, ordenados alfabeticamente
		persons.stream().map(Person::getLastName) // Obtém o sobrenome de cada pessoa
				.distinct() // Filtra os sobrenomes únicos
				.sorted() // Ordena os sobrenomes
				.forEach(System.out::println); // Imprime cada sobrenome

		scanner.close(); // Fecha o scanner
	}
}
