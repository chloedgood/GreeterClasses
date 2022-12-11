package greeterClasses;

public class LoudGreeter extends Greeter {
	private static String extra = "!";

	public LoudGreeter(String greeting) {
		super(greeting);

	}
	
	public static void addVolume() {
		extra += extra;
	}
	
	@Override
	public String Greet(String name) {
		addVolume();
		return super.Greet(name) + extra;
		
	}

}
