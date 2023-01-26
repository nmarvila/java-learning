package records.nonCanonConstructor;

public class RecordDemo {
	public static void main(String[] args) {
		Employee[] empList = new Employee[4];
		
		empList[0] = new Employee("Doe, John", 1047);
		empList[1] = new Employee("Jones, Robert", 1048);
		empList[2] = new Employee("Smith, Rachel", 1049);
		
		empList[3] = new Employee("Martin, Dave");
		
		for(Employee e: empList) {
			System.out.print("The employee ID for " + e.name() + " is ");
			if(e.idNum() == Employee.pendingID) System.out.println("Pending");
			else System.out.println(e.idNum());
		}
	}
}
