package enumerations;

public class EnumDemo2 {
	public static void main(String[] args) {
		Apple ap;
		
		System.out.println("Here are all Apple constants:");
		
		for (Apple a : Apple.values())
			System.out.println(a);
		
		System.out.println();
		
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
	}
}
