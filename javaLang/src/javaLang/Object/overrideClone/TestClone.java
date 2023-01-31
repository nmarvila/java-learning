package javaLang.Object.overrideClone;

public class TestClone implements Cloneable {
	int a;
	double b;
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
}
