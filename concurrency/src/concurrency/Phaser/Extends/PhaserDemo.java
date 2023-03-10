package concurrency.Phaser.Extends;

public class PhaserDemo {
	public static void main(String[] args) {
		MyPhaser phsr = new MyPhaser(1, 4);
		
		System.out.println("Starting\n");
		
		new Thread(new MyThread(phsr, "A")).start();
		new Thread(new MyThread(phsr, "B")).start();
		new Thread(new MyThread(phsr, "C")).start();
		
		while(!phsr.isTerminated()) {
			phsr.arriveAndAwaitAdvance();
		}
		
		System.out.println("The Phaser is terminated");
	}
}
