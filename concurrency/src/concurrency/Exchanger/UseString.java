package concurrency.Exchanger;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
	Exchanger<String> ex;
	String str;
	
	UseString(Exchanger<String> c) {
		ex = c;
	}
	
	public void run() {
		for(int i=0; i < 3; i++) {
			try {
				str = ex.exchange(new String());
				System.out.println("Got: " + str);
			} catch(InterruptedException exc) {
				System.out.println(exc);
			}
		}
	}
}
