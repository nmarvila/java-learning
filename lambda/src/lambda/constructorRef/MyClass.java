package lambda.constructorRef;

public class MyClass {
	private int val;
	
	MyClass(int v) { val = v; }
	
	MyClass() { val = 0; }
	
	int getVal() { return val; }
}
