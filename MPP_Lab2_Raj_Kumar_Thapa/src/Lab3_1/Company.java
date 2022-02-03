package Lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String name;
	private List<Department> departmentList = new ArrayList<Department>();
	
	public List<Department> getDepartmentList(){
		return departmentList;
	}
	
	public void addDepartment(Department department) {
		departmentList.add(department);
	}
	
	public Company(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("\nCompany Name: " + name);
		if(!departmentList.isEmpty()) {
			for(Department department : departmentList) {
				department.print();
			}
		}
	}
	
	public double getSalary() {
		double totalSalary = 0;
		for (Department department : departmentList) {
			totalSalary += department.getSalary();
		}
		return totalSalary;
	}
}