package Level1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StaffStudents extends Student implements Employee{
	
	private double salary;
	private LocalDate firstCourseDate;
	private List<Course> courseList = new ArrayList<Course>();

	public List<Course> getArrayCourse() {
        return courseList;
    }
	
	public void setArrayCourse(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

	public void addCourse(Course course) {
    	courseList.add(course);
    }

	public StaffStudents(String name, String phone, int age, double gpa, double salary) {
		super(name, phone, age, gpa);
		this.salary = salary;
	}
	
	public LocalDate getFirstCourseDate() {
		return firstCourseDate;
	}
	
	public void setFirstCourseDate(int y, int m, int d) {
		firstCourseDate = LocalDate.of(y, m, d);
	}

	@Override
	public double getSalary() {		
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
    }

}