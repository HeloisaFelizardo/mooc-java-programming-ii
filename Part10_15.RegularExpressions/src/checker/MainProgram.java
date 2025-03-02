package checker;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String string = scanner.nextLine();

		Checker checker = new Checker();

		if (checker.isDayOfWeek(string)) {
			System.out.println("The form is correct.");
		} else {
			System.out.println("The form is incorrect.");
		}
		
		if (checker.allVowels(string)) {
			System.out.println("The form is correct.");
		} else {
			System.out.println("The form is incorrect.");
		}
		
		if (checker.timeOfDay(string)) {
			System.out.println("The form is correct.");
		} else {
			System.out.println("The form is incorrect.");
		}
		
		scanner.close();
	}
}
