package concurrency.Semaphore;

public class Consumer implements Runnable {
	Q q;
	
	Consumer(Q q) {
		this.q = q;
	}
	
	public void run() {
		for(int i = 0; i < 20; i++) q.get();
	}
}
