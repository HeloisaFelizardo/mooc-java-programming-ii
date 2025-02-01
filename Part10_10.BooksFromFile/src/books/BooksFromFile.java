package books;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do arquivo: ");
		String filename = scanner.nextLine();

		List<Book> lines = readBooks(filename);

		if (!lines.isEmpty()) {
			System.out.println("Linhas lidas do arquivo: ");
			lines.forEach(System.out::println);
		} else {
			System.out.println("Nenhuma linha foi lida. Verifique o arquivo.");
		}

		scanner.close();
	}

	public static List<Book> readBooks(String file) {
		List<Book> books = new ArrayList<>();

		try {
			books = Files.lines(Paths.get(file), StandardCharsets.UTF_8).map(line -> line.split(","))
					.filter(parts -> parts.length == 4) // Garante que há 4 partes na linha
					.map(parts -> {
						try {
							String name = parts[0].trim();
							int year = Integer.parseInt(parts[1].trim());
							int pages = Integer.parseInt(parts[2].trim());
							String author = parts[3].trim();
							return new Book(name, year, pages, author);
						} catch (NumberFormatException e) {
							System.out.println("Erro ao processar linha: " + String.join(",", parts));
							return null;
						}
					}).filter(book -> book != null).collect(Collectors.toList());
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		return books;
	}
}
