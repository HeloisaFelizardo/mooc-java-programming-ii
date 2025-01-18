package main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Exibe o diretório atual para entender onde o programa está sendo executado
		System.out.println("Diretório de trabalho atual: " + System.getProperty("user.dir"));

		System.out.println("Digite o nome do arquivo: ");
		String fileName = scanner.nextLine();

		// Chamar o método read e exibir as linhas do arquivo
		List<String> lines = read(fileName);

		if (!lines.isEmpty()) {
			System.out.println("Linhas lidas do arquivo:");
			lines.forEach(System.out::println);
		} else {
			System.out.println("Nenhuma linha foi lida. Verifique o arquivo.");
		}

		scanner.close();
	}

	public static List<String> read(String file) {
		
		List<String> rows = new ArrayList<>();

		try {
			Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		return rows;
	}
}
