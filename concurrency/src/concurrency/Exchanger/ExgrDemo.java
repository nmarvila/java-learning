package concurrency.Exchanger;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
	public static void main(String[] args) {
		Exchanger<String> exgr = new Exchanger<String>();
		
		new Thread(new UseString(exgr)).start();
		new Thread(new MakeString(exgr)).start();
	}
}
