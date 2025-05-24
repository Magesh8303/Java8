package com.java.thread;

public class YieldExample1 {

	public static void main(String[] args) {

		Runnable r1 = () -> {

			for (int i = 0; i <= 5; i++) {

				System.out.println(Thread.currentThread().getName() + " running " + i);
				Thread.yield();

			}

		};

		Thread t1 = new Thread(r1, "Thread1");
		Thread t2 = new Thread(r1, "Thread2");
		
		t1.start();
		t2.start();
	}

}
