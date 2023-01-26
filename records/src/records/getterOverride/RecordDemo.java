package records.getterOverride;

public class RecordDemo {
	public static void main(String[] args) {
		Employee emp = new Employee("Jones, Robert", 1048);
		
		System.out.println("Employee full name is " + emp.name());
		
		System.out.println("Employee last name is " + emp.lastName());
	}
}
