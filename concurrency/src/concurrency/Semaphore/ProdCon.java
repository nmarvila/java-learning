package concurrency.Semaphore;

public class ProdCon {
	public static void main(String[] args) {
		Q q = new Q();
		new Thread(new Consumer(q), "Consumer").start();
		new Thread(new Producer(q), "Producer").start();
	}
}
