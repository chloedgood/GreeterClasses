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
		
	}

}
