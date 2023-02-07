package concurrency.Semaphore;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable {
	String name;
	Semaphore sem;
	
	DecThread(Semaphore s, String n) {
		sem = s;
		name = n;
	}
	
	public void run() {
		System.out.println("Starting " + name);
		
		try {
			System.out.println(name + " is waiting for a permit.");
			sem.acquire();
			System.out.println(name + " gets a permit.");
			
			for(int i=0; i < 5; i++) {
				Shared.count--;
				System.out.println(name + ": " + Shared.count);
				
				Thread.sleep(10);
			}
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
		
		System.out.println(name + " releases the permit.");
		sem.release();
	}
}
