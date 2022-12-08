package greeterClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {
	
	//Constructor test: parameter = "Guten Tag" → greeting field will be "Guten Tag"
	//Constructor test: parameter = "Howdy there" → greeting field will be "Howdy there"
			//greet method test: greeting field = "Buenos Dias", name parameter = "Julia" → return "Buenos Dias, Julia!"


	@Test
	void test1() {
		Greeter g = new Greeter("Guten Tag");	
		assertEquals("Guten Tag", g.greeting);
	}

	@Test
	void test2() {
		Greeter g = new Greeter("Howdy There");	
		assertEquals("Howdy There", g.greeting);
	}
	
	@Test
	void test3() {
		Greeter g = new Greeter("Hola");	
		assertEquals("Hola", g.greeting);
	}
	
	@Test
	void test4() {
		Greeter g = new Greeter("Hello");	
		assertEquals("Hello", g.greeting);
	}
	
	@Test
	void test5() {
		Greeter g = new Greeter("Aloha");	
		assertEquals("Aloha", g.greeting);
	}
	
	@Test
	void test6() {
		Greeter g = new Greeter("Yo");	
		assertEquals("Yo", g.greeting);
	}
}
