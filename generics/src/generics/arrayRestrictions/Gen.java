package generics.arrayRestrictions;

public class Gen<T extends Number> {
	T ob;
	
	T[] vals;
	
	Gen(T o, T[] nums) {
		ob = o;
		
//		vals = new T[10];
		
		vals = nums;
	}
}
