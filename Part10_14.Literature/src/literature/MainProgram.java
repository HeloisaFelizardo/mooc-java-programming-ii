package literature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/* Part 1: Reading and printing the books
 * Part 2: Ordering books based on their age recommendation
 * Part 3: Ordering books based on their age recommendation and name *
 * 
 * Output:
 * 
 * 4 books in total.
 * 
 * Books:
 * The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)
 * The Ringing Lullaby Book (recommended for 0 year-olds or older)
 * Litmanen 10 (recommended for 10 year-olds or older)
 * The Snowy Forest Calls (recommended for 12 year-olds or older) * 
 */

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Book> books = new ArrayList<>();

		while (true) {
			System.out.println("Input the name of the book, empty stops: ");
			String name = scanner.nextLine();

			if (name.isEmpty()) {
				break;
			}

			System.out.println("Input the age recommendation: ");
			int age = Integer.parseInt(scanner.nextLine());

			books.add(new Book(name, age));
		}

		scanner.close();

		System.out.println("\n" + books.size() + " books in total.\n");

		books.sort(Comparator.comparingInt(Book::getAge).thenComparing(Book::getName));

		books.forEach(System.out::println);
	}
}
