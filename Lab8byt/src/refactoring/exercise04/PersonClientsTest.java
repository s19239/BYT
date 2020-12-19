package refactoring.exercise04;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.*;
//The Person class has multiple clients, but all of the clients are in 
//one file for convenience.  Imagine them as non-test methods in separate 
//client classes.

public class PersonClientsTest {

	@Test
	public void testClients() throws IOException {
		Person bobSmith = new Person("Smith", "Bob", null);
		Person jennyJJones = new Person("Jones", "Jenny", "J");

		StringWriter out = new StringWriter();
		Person.displayFML(out, bobSmith);
		assertEquals("Bob Smith", out.toString());

		out = new StringWriter();
		Person.displayFML(out, jennyJJones);
		assertEquals("Jenny J Jones", out.toString());

		assertEquals("Smith, Bob", Person.displayLFM(bobSmith));
		assertEquals("Jones, Jenny J", Person.displayLFM(jennyJJones));

		out = new StringWriter();
		Client3.displayLFM(out, bobSmith);
		assertEquals("Smith, Bob", out.toString());

		out = new StringWriter();
		Client3.displayLFM(out, jennyJJones);
		assertEquals("Jones, Jenny J", out.toString());
		
		assertEquals("Smith, Bob", Person.displayLFM(bobSmith));
		assertEquals("Jones, Jenny J", Person.displayLFM(jennyJJones));
		
		
	}
}
