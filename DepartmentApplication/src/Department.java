import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    List<Person> personList = new ArrayList<Person>();
    List<Course> courseList = new ArrayList<Course>();

    public List<Course> getArrayCourse() {
        return courseList;
    }

    public void setArrayCourse(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Person> getArrayPerson() {
        return personList;
    }

    public void setArrayPerson(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }
    
    public void addCourse(Course course) {
    	this.courseList.add(course);
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAllMembers() {
    	for (Person person : personList) {
    		System.out.println("Name: " + person.name + "\nPhone: " + person.phone + "\nAge: " + person.age + "\n" + "Type: " +  person.getClass().getSimpleName() + "\n");
    	}
    }

    public void unitsPerFaculty() {
        for (Course course : courseList) {
            System.out.println(course.getPerson().getName() + " " + course.getUnits());
        }
    }

    public double getTotalSalary() {
		double totalSalary = 0;
		for(Object person : personList) {
			if(person.getClass().getSimpleName() == "Faculty") {
				Faculty faculty = (Faculty) person;
				totalSalary += faculty.getSalary();
			}
			else if(person.getClass().getSimpleName() == "Staff") {
				Staff staff = (Staff) person;
				totalSalary += staff.getSalary();
			}
		}
		return totalSalary;
	}
    
}