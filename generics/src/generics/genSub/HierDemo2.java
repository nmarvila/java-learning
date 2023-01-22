package generics.genSub;

public class HierDemo2 {
	public static void main(String[] args) {
		Gen<String> w = new Gen<String>("Hello", 47);
		
		System.out.print(w.getOb() + " ");
		System.out.println(w.getnum());
	}
}
