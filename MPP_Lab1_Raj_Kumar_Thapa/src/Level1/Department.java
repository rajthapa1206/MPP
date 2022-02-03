package Level1;
import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    List<Person> personList = new ArrayList<Person>();

    public List<Person> getArrayPerson() {
        return personList;
    }

    public void setArrayPerson(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        this.personList.add(person);
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
    	for (Person person : personList) {
			/*
			 * if(person instanceof Faculty) { Faculty faculty = (Faculty) person;
			 * System.out.println(faculty.getName() + " " + faculty.getTotalUnits()); }
			 */
    		if(person.getClass().getSimpleName().equals("Faculty")) {
				Faculty faculty = (Faculty) person;
				System.out.println(faculty.getName() + " " + faculty.getTotalUnits());
			}

    	}
    }

    public double getTotalSalary() {
		double totalSalary = 0;
		/*
		 * for(Object person : personList) { if(person instanceof Faculty) { Faculty
		 * faculty = (Faculty) person; totalSalary += faculty.getSalary(); } else
		 * if(person instanceof Staff) { Staff staff = (Staff) person; totalSalary +=
		 * staff.getSalary(); } }
		 */
		for (Person person : personList) {
			totalSalary += person.getSalary();
		}
		return totalSalary;
	}
    
    public List<String> getFacultyNames(){
    	List<String> facultyNames = new ArrayList<String>();
    	for (Person person: this.personList) {
    		if(person instanceof Faculty) {
    			facultyNames.add(person.getName());
    		}
    	}
    	return facultyNames;
    }
    
    public Faculty getFaculty(String facultyName) {
    	for (Person person : this.personList) {
    		if(person instanceof Faculty) {
    			if (person.name.equals(facultyName))
    				return (Faculty) person;
    		}
    	}
    	return null;
    }
    
    public void getStudents(String facultyName) {
    	Faculty faculty = getFaculty(facultyName);	
    	List<Student> students = new ArrayList<Student>();
    	for(Course course : faculty.courseList) {
    		for (Person person : this.personList) {
    			if (person instanceof Student) {
    				Student student = (Student) person;
    				if (student.courseList.contains(course) && !students.contains(student))
    					students.add(student);
    			}
    		}
    	}
    	for (Student student: students) {
    		System.out.println("\nStudent Name: " + student.name);
    	}
    }
}