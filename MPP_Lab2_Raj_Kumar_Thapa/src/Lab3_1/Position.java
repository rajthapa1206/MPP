package Lab3_1;


public class Position {
	
	private String title;
	private String description;
	private Employee employee;
	private Department department;
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Position(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void print() {
		System.out.println("\nTitle: " + title +
				"\nDescription: " + description);
		if (employee != null) {
			employee.print();
		}
		else {
			System.out.println("\nEmployee: " + employee);
		}
	}
	
	public double getSalary() {
		if (employee != null) return employee.getSalary();
		else return 0;
	}
}