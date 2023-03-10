package concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
	CountDownLatch latch;
	
	MyThread(CountDownLatch c) {
		latch = c;
	}
	
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			latch.countDown();
		}
	}
}
