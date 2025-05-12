package com.java.thread;

class Thread1 extends Thread {

	public void run() {
		System.out.println("Thread :" + Thread.currentThread().getName());
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread :" + Thread.currentThread().getName());
	}
	
}

public class Example {

	public static void main(String[] args) {

		Thread1 t = new Thread1();
		t.start();
		
		Thread2  t2 = new Thread2();
		t2.run();
		
	}

}
