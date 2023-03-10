package concurrency.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
		
		System.out.println("Starting");
		
		new Thread(new MyThread(cb, "A")).start();
		new Thread(new MyThread(cb, "B")).start();
		new Thread(new MyThread(cb, "C")).start();
		new Thread(new MyThread(cb, "X")).start();
		new Thread(new MyThread(cb, "Y")).start();
		new Thread(new MyThread(cb, "Z")).start();
	}
}
