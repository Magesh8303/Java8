package com.java.anonymous;

import java.util.Arrays;
import java.util.List;

public class AnonymousClassExample1 {

	public static void main(String[] args) {
		
		List<String> names= Arrays.asList("Magesh","Kumar","Aathi");
				 
		Runnable run = new Runnable() {

			@Override
			public void run() {
				
				System.out.println("running");
				
			}
			
		};
		
		run.run();
		
		

	}

}
