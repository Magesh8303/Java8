package com.java.thread;

public class YieldExample {

	public static void main(String[] args) {

		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		producer.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);

		producer.start();
		consumer.start();
	}

}

class Producer extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("I am producer: Producer Count " + i);
			Thread.yield();
		}
	}

}

class Consumer extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("I am Consumer: Consumer Count " + i);
			Thread.yield();
		}
	}

}