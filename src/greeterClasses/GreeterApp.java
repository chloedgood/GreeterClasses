package greeterClasses;

import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("What is your preferred greeting?");
		String prefGreeting = scan.next();
		
		Greeter hello = new Greeter(prefGreeting);
		System.out.println(hello.Greet(name));
		
		SimonGreeter sg1 = new SimonGreeter(prefGreeting);
		System.out.println(sg1.Greet(name));
		
		LoudGreeter lg1 = new LoudGreeter("Say it loud");
		System.out.println(lg1.Greet(name));
		
		HtmlGreeter hg1 = new HtmlGreeter("Hello");
		System.out.println(hg1.Greet(name));
		
		HtmlGreeter hg2 = new HtmlGreeter("Hello", "hg3");
		System.out.println(hg1.Greet(name));
		
		scan.close();
		
	}
	

}
