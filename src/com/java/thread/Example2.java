package com.java.thread;

public class Example2 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Example2Thread1());
		Thread t2 = new Thread(new Example2Thread2());

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread completed");

	}

}

class Example2Thread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread1 : " + i);
		}
	}

}

class Example2Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread2 : " + i);
		}
	}

}
