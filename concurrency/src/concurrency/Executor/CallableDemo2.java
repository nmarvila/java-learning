package concurrency.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo2 {
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
			System.out.println(f.get(10, TimeUnit.MILLISECONDS));
			System.out.println(f2.get(10, TimeUnit.MILLISECONDS));
			System.out.println(f3.get(10, TimeUnit.MILLISECONDS));
		} catch (InterruptedException exc) {
			System.out.println(exc);
		} catch (ExecutionException exc) {
			System.out.println(exc);
		} catch (TimeoutException exc) {
			System.out.println(exc);
		}
		
		es.shutdown();
		System.out.println("Done");
	}
}
