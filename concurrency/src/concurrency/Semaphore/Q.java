package concurrency.Semaphore;

import java.util.concurrent.Semaphore;

public class Q {
	int n;
	
	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);
	
	void get() {
		try {
			semCon.acquire();
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		System.out.println("Got: " + n);
		semProd.release();
	}
	
	void put(int n) {
		try {
			semProd.acquire();
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		this.n = n;
		System.out.println("Put: " + n);
		semCon.release();
	}
}
