package concurrency.CyclicBarrier;

public class BarAction implements Runnable {
	public void run() {
		System.out.println("Barrier Reached!");
	}
}
