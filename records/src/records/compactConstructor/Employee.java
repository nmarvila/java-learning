package records.compactConstructor;

public record Employee(String name, int idNum) {
	public Employee {
		name = name.trim();
	}
}
