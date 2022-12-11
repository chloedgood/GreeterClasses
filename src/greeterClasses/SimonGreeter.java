package greeterClasses;

public class SimonGreeter extends Greeter {

	public SimonGreeter(String greeting) {
		super(greeting);
		
	}

		@Override
		public String Greet (String name) {
			return "Simon Says, " + greeting + ", " + name + "!";
			

	}

}
