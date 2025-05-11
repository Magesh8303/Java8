package com.java.anonymous;

interface Greeting{
	void greet();
	void greet2();
}

public class Example1 {
	
	public static void main(String[] args) {
		
		Greeting anoyoumusGreeting = new Greeting() {

			@Override
			public void greet() {
				System.out.println("Greeting");
				
			}

			@Override
			public void greet2() {
				System.out.println("Greeting2");
				
			}
			
		};
		
		anoyoumusGreeting.greet();
		anoyoumusGreeting.greet2();
		
	}

}
