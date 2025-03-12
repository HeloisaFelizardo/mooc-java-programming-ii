package education;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

	private List<Person> persons;

	public Employees() {
		this.persons = new ArrayList<>();
	}

	public void add(Person personToAdd) {
		this.persons.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd) {
		this.persons.addAll(peopleToAdd);
	}

	public void print() {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// persons.forEach(System.out::println); //Usando forEach diretamente
	}

	public void print(Education education) {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getEducation() == education) {
				System.out.println(person);
			}
		}
		// persons.stream().filter(person -> person.getEducation() == education).forEach(System.out::println); //Usando filter
	}

	public void fire(Education education) {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getEducation() == education) {
				iterator.remove();
			}
		}
		// persons.removeIf(person -> person.getEducation() == Education.HIGHER); // Remover sem Iterator
	}
}
