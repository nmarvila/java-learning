package concurrency.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer> f;
		Future<Double> f2;
		Future<Integer> f3;
		
		System.out.println("Starting");
		
		f = es.submit(new Sum(10));
		f2 = es.submit(new Hypot(3, 4));
		f3 = es.submit(new Factorial(5));
		
		try {
			System.out.println(f.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
		} catch (InterruptedException exc) {
			System.out.println(exc);
		} catch (ExecutionException exc) {
			System.out.println(exc);
		}
		
		es.shutdown();
		System.out.println("Done");
	}
}
