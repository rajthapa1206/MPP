package Lab3_1;

import java.time.LocalDate;

public class Employee {

	private String employeeId;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private LocalDate birthDate;
	private String ssn;
	private double salary;
	private Position position;
	
	public Employee(String employeeId, String firstName, char middleInitial, String lastName, int year, int month, int day, String ssn, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = LocalDate.of(year, month, day);
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public char getMiddleInitial() {
		return middleInitial;
	}
	
	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(int month, int day, int year) {
		this.birthDate = LocalDate.of(year, month, day);
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position){
		this.position = position;
	}
	
	public void print() {
		System.out.println("\nEmployeeId: " + employeeId + 
				"\nName: " + firstName + " " + middleInitial + " " + lastName +
				"\nBirth Date: " + birthDate.toString() + 
				"\nSSN: " + ssn +
				"\nSalary: " + salary);
	}
}