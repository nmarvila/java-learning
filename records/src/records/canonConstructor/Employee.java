package records.canonConstructor;

public record Employee(String name, int idNum) {
	public Employee(String name, int idNum) {
		this.name = name.trim();
		this.idNum = idNum;
	}
}
