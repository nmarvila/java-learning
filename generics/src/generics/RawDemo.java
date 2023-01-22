package generics;

public class RawDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		Gen<String> strOb = new Gen<String>("Generics Test");
		
		Gen raw = new Gen(Double.valueOf(98.6));
		
		double d = (Double) raw.getOb();
		System.out.println("value: " + d);
		
//		int i = (Integer) raw.getOb();
		
		strOb = raw;
//		String str = strOb.getOb();
		
		raw = iOb;
//		d = (Double) raw.getOb();
	}
}
