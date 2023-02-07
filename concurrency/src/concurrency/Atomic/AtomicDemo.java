package concurrency.Atomic;

public class AtomicDemo {
	public static void main(String[] args) {
		new Thread(new AtomThread("A")).start();
		new Thread(new AtomThread("B")).start();
		new Thread(new AtomThread("C")).start();
	}
}
