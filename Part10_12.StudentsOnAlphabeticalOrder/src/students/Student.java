package students;

public class Student implements Comparable<Student> {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Student other) {
		// Use String's compareTo to sort by name in natural (alphabetical) order.
		return this.name.compareTo(other.name);
	}

	public int compareToIgnoreCase(Student other) {
		return this.name.compareToIgnoreCase(other.name);
	}
}
