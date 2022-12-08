package greeterClasses;

public class Greeter {

		public String greeting;
		public String name;
		
		public String getGreeting() { 
			return greeting;
		} 
		public void setGreeting(String g) {
			this.greeting = g;
		
		}
		public Greeter(String greeting) {
			this.greeting = greeting;
		}
		public String Greet(String name) {
			this.name = name;
			return this.greeting + ", " + this.name + "!";
	
	}
}



