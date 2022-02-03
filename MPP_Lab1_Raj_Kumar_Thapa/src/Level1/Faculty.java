package Level1;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

    private double salary;
    List<Course> courseList = new ArrayList<Course>();

    public List<Course> getArrayCourse() {
        return courseList;
    }

    public void setArrayCourse(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course course) {
    	courseList.add(course);
    }

    public Faculty(String name, String phone, int age, double salary) {
        super(name,phone,age);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getTotalUnits() {
    	int totalUnits = 0;
    	for (Course course : courseList) {
    		totalUnits += course.getUnits();
    	}
    	return totalUnits;
    }

}