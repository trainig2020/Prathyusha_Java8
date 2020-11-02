package com.prathyusha.unit1;

public class Greeter {
	/*
	 * public void greet() { System.out.println("Hello World! "); }
	 */
	

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		
		
		/* lambda expression */
	Greeting lambdaGreeting = () -> System.out.print("Hello world! ");
		
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World! ");
			}
		};
		
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
		
		
			
		
	}

}

/*
 * interface MyLambda{ void foo(); }
 */

/*
 * interface MyAdd{ int add(int x, int y); }
 */