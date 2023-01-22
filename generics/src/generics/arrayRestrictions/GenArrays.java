package generics.arrayRestrictions;

public class GenArrays {
	public static void main(String[] args) {
		Integer[] n = { 1, 2, 3, 4, 5 };
		
		Gen<Integer> iOb = new Gen<Integer>(50, n);
		
//		Gen<Integer>[] gens = new Gen<Integer>[10];
		
		Gen<?>[] gens = new Gen<?>[10];
	}
}
