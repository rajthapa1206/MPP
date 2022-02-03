package Lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private String location;
	private List<Position> positionList = new ArrayList<Position>();
	private Company company;
	
	public List<Position> getPositionList(){
		return positionList;
	}
	
	public void addPosition(Position position) {
		positionList.add(position);
	}
	
	public Department(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public void print() {
		System.out.println("\nDepartment Name: " + name +
				"\nLocation: " + location);
		if (!positionList.isEmpty()) {
			for(Position position : positionList) {
				position.print();
			}
		}
	}
	
	public double getSalary() {
		double totalSalary = 0;
		for (Position position : positionList) {
			totalSalary += position.getSalary();
		}
		return totalSalary;
	}
}