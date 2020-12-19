package refactoring.exercise04;

import java.io.IOException;
import java.io.Writer;

/*
* Program displays person's details in two formats
* FirstName MiddleName LastName
* LastName, FirstName MiddleName.
*If the aim of the 'Client' class is to present just a client, one 'Client' class,I decided to keep it maybe there is a purpose to have 4 classes
* */
public class Person {
	public String last;

	public String first;

	public String middle;

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;
	}
	public static String displayLFM(Person person) {
		return person.last + ", " + person.first
				+ ((person.middle == null) ? "" : " " + person.middle);
	}

	public static void displayLFM(Writer out,Person person) throws IOException {
		out.write(person.last);
		out.write(", ");
		out.write(person.first);
		if (person.middle != null) {
			out.write(" ");
			out.write(person.middle);
		}
	}

	
	public static String displayFML(Person person) {
		return person.first
				+ ((person.middle == null) ? "" : " " + person.middle + person.last);
	}

	public static void displayFML(Writer out,Person person) throws IOException {
		out.write(person.first);
		out.write(" ");
		if (person.middle != null) {
			out.write(person.middle);
			out.write(" ");
		}
		out.write(person.last);
	}
}