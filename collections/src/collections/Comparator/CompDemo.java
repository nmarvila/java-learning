package collections.Comparator;

import java.util.TreeSet;

public class CompDemo {
	public static void main(String[] args) {
		MyComp mc = new MyComp();
		
		TreeSet<String> ts = new TreeSet<String>(mc.reversed());
		
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		for(String element : ts)
			System.out.print(element + " ");
		
		System.out.println();
	}
}
