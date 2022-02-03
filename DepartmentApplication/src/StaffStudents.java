public class StaffStudents extends Student implements Employee{
	
	private double salary;

	public StaffStudents(String name, String phone, int age, double gpa, double salary) {
		super(name, phone, age, gpa);
		this.salary = salary;
	}

	@Override
	public double getSalary() {		
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
    }

}