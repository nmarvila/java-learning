package lambda.genConstructorRef;

public class MyClass<T> {
	private T val;
	
	MyClass(T v) { val = v; }
	
	MyClass() { val = null; }
	
	T getVal() { return val; }
}
