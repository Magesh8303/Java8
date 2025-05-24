package com.java.thread;

public class JoinExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {

			for (int i = 0; i <= 5; i++) {

				try {
					System.out.println("Thread 1: " + i);

				} catch (Exception ex) {

				}
			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 0; i <= 5; i++) {
				
				try {
					
					t1.join();
					System.out.println("Thread 2: " + i);

				} catch (Exception ex) {

				}
			}

		});

		t1.start();
		t2.start();

	}

}
