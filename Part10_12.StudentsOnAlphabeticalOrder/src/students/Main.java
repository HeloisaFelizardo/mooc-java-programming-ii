package students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Student> students = new ArrayList<>();

		System.out.println("Enter student names (type 'exit' to stop):");

		while (true) {
			String studentName = scanner.nextLine();

			if (studentName.equalsIgnoreCase("exit")) {
				break;
			}

			students.add(new Student(studentName));
		}

		scanner.close();

		Collections.sort(students);

		System.out.println("\nSorted Students: ");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
