package com.java.anonymous;

abstract class exampleInterface{
	
	public abstract void greeting();
	
}

public class Example2 {
	public static void main(String[] args) {
		
		
		exampleInterface  ex = new exampleInterface() {

			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				
				System.out.println("abstract class method anaoyoums class");
				
			}
			
		};
		
		ex.greeting();
	}

}
