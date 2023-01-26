package records.constructorCheck;

public record Employee(String name, int idNum) {
	public Employee {
		name = name.trim();
		
		int i = name.indexOf(',');
		int j = name.lastIndexOf(',');
		if(i != j) throw
			new IllegalArgumentException("Multiple commas found.");
		
		if(i < 1 | name.length() == i+1) throw
			new IllegalArgumentException("Required format: last, first");
	}
}
