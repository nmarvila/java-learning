package concurrency.Exchanger;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable {
	Exchanger<String> ex;
	String str;
	
	MakeString(Exchanger<String> c) {
		ex = c;
		str = new String();
	}
	
	public void run() {
		char ch = 'A';
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++)
				str += ch++;
			
			try {
				str = ex.exchange(str);
			} catch(InterruptedException exc) {
				System.out.println(exc);
			}
		}
	}
}
