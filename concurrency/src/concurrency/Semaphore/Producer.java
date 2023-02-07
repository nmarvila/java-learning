package concurrency.Semaphore;

public class Producer implements Runnable {
	Q q;
	
	Producer(Q q) {
		this.q = q;
	}
	
	public void run() {
		for(int i=0; i < 20; i++) q.put(i);
	}
}
