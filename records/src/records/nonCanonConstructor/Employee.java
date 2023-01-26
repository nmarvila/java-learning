package records.nonCanonConstructor;

public record Employee(String name, int idNum) {
	static int pendingID = -1;
	
	public Employee {
		name = name.trim();
	}
	
	public Employee(String name) {
		this(name, pendingID);
	}
}
