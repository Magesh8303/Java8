package com.java.anonymous;

import java.util.Arrays;
import java.util.List;

public class AnonymousClassExample1 {

	public static void main(String[] args) {
		
		Thread t = new Thread() {
			
			public void run() {
				System.out.println("Thread name "+Thread.currentThread().getName());
			}
			
		};
		
		t.run();
		t.start();
				 
		Runnable run = new Runnable() {

			@Override
			public void run() {
				
				System.out.println("running "+Thread.currentThread().getName());
				
			}
			
		};
		
		run.run();
		
		

	}

}
