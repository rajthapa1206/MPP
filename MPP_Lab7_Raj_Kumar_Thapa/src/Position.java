import java.util.Objects;

public class Position implements Cloneable {
	
	private String title;
	private String description;
	private Employee employee;
	//private Department department;
	
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
	
	/*
	 * public Department getDepartment() { return department; }
	 * 
	 * public void setDepartment(Department department) { this.department =
	 * department; }
	 */
	
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

	@Override
	public int hashCode() {
		return Objects.hash(description, employee, title);
		//return Objects.hash(department, description, employee, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return description.equals(other.description)
				&& employee.equals(other.employee) && title.equals(other.title); //department.equals(other.department) && 
	}

	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description + ", employee=" + employee +  "]"; //, department="+ department + "]";
	}
	

	@Override
	public Object clone() throws CloneNotSupportedException {
		Position copy = (Position)super.clone();
		return copy;
	} 

}