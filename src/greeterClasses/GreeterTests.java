package greeterClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {
	
	//Constructor test: parameter = "Guten Tag" → greeting field will be "Guten Tag"
	//Constructor test: parameter = "Howdy there" → greeting field will be "Howdy there"
			//greet method test: greeting field = "Buenos Dias", name parameter = "Julia" → return "Buenos Dias, Julia!"


	@Test
	void Greetertest1() {
		Greeter g = new Greeter("Guten Tag");	
		assertEquals("Guten Tag", g.greeting);
	}

	@Test
	void Greetertest2() {
		Greeter g = new Greeter("Howdy There");	
		assertEquals("Howdy There", g.greeting);
	}
	
	@Test
	void Greetertest3() {
		Greeter g = new Greeter("Hola");	
		assertEquals("Hola", g.greeting);
	}
	
	@Test
	void Greetertest4() {
		Greeter g = new Greeter("Hello");	
		assertEquals("Hello", g.greeting);
	}
	
	@Test
	void Greetertest5() {
		Greeter g = new Greeter("Aloha");	
		assertEquals("Aloha", g.greeting);
	}
	
	@Test
	void Greetertest6() {
		Greeter g = new Greeter("Yo");	
		assertEquals("Yo", g.greeting);
	}
	
	@Test
	void SimonGreetertest1() {
		SimonGreeter sg1 = new SimonGreeter("Howdy");	
		assertEquals("Howdy", sg1.greeting);
	}
	
	@Test
	void LoudGreetertest1() {
		SimonGreeter lg1 = new SimonGreeter("Hey there");	
		assertEquals("Hey there" , lg1.greeting);
	}
	
	@Test
	void HtmlGreetertest1() {
		HtmlGreeter hg1 = new HtmlGreeter("Bonjour");	
		assertEquals("Bonjour" , hg1.greeting);
	}
	
	@Test
	void HtmlGreetertest2() {
		HtmlGreeter hg2 = new HtmlGreeter("Ciao");	
		assertEquals("Ciao" , hg2.greeting);
	}
	
	
	
	
	
	//test HTML greeter
	
	//test HTML greeter 2
	
}
