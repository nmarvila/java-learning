package lambda.genConstructorRef;

public class ConstructorRefDemo {
	public static void main(String[] args) {
		MyFunc<Integer> myClassCons = MyClass<Integer>::new;
		
		MyClass<Integer> mc = myClassCons.func(100);
		
		System.out.println("val in mc is " + mc.getVal());
	}
}
