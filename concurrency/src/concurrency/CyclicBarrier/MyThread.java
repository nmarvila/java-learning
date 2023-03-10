package concurrency.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread implements Runnable {
	CyclicBarrier cbar;
	String name;
	
	MyThread(CyclicBarrier c, String n) {
		cbar = c;
		name = n;
	}
	
	public void run() {
		System.out.println(name);
		
		try {
			cbar.await();
		} catch (BrokenBarrierException exc) {
			System.out.println(exc);
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
}
