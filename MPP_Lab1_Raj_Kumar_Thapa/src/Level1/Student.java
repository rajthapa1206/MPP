package Level1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private double gpa;
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

    public Student(String name, String phone, int age, double gpa) {
        super(name, phone, age);
        this.gpa = gpa;
    }

    public double getgpa() {
        return gpa;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }
    
    public int getTotalUnits() {
    	int totalUnits = 0;
    	for (Course course : courseList) {
    		totalUnits += course.getUnits();
    	}
    	return totalUnits;
    }
}