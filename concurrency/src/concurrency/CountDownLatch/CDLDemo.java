package concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		
		System.out.println("Starting");
		
		new Thread(new MyThread(cdl)).start();
		
		try {
			cdl.await();
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
		
		System.out.println("Done");
	}
}
