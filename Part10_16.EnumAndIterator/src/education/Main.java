package education;

public class Main {

	public static void main(String[] args) {
		Person anna = new Person("Anna", Education.PHD);

		System.out.println(anna);

		Employees university = new Employees();
		university.add(new Person("Petrus", Education.PHD));
		university.add(new Person("Arto", Education.HS));
		university.add(new Person("Elina", Education.PHD));

		university.print();

		university.fire(Education.HS);

		System.out.println("==");

		university.print();
	}
}