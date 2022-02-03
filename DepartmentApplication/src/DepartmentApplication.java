import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepartmentApplication {

    public static void main(String[] args) throws IOException {

        Department dept = new Department("ComputerScience");

        Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
        Person samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
        Person johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);

        dept.addPerson(frankMoore);
        dept.addPerson(samHoward);
        dept.addPerson(johnDoodle);

        // Create student objects
        Person johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
        Person maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
        Person leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);

        dept.addPerson(johnDoe);
        dept.addPerson(maryJones);
        dept.addPerson(leeJohnson);

        // Create staff objects
        Person frankGore = new Staff("Frank Gore", "472-3321", 33, 4050);
        Person adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500);
        Person davidHeck = new Staff("David Heck", "472-8890", 29, 3600);

        dept.addPerson(frankGore);
        dept.addPerson(adamDavis);
        dept.addPerson(davidHeck);

        Course cs201 = new Course("cs201", "programming", 4, johnDoodle);
        Course cs360 = new Course("cs360", "database", 3, samHoward);
        Course cs404 = new Course("cs404", "compiler", 4, johnDoodle);
        Course cs240 = new Course("cs240", "datastructure", 2, johnDoodle);
        Course cs301 = new Course("cs301", "Software engg", 3, samHoward);
        Course cs450 = new Course("cs450", "Advanced architecture", 5, frankMoore);
		
        dept.addCourse(cs201);
        dept.addCourse(cs360);
        dept.addCourse(cs404);
        dept.addCourse(cs240);
        dept.addCourse(cs301);
        dept.addCourse(cs450);

        double totsalary = 0;
        while (true) {
            putText("\nEnter first letter of ");
            putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit :");
            int choice = getChar();
            switch (choice) {
                case 'g':
                    totsalary = dept.getTotalSalary();
                    putText("Total sum of all salaries is:");
                    putText(String.valueOf(totsalary) + "\n");
                    break;
                case 's':
                    dept.showAllMembers();
                    break;
                case 'u':
                    dept.unitsPerFaculty();
                    break;
                case 'q':
                    return;
                default:
                    putText("Invalid entry\n");
            }
        }
    }

    //writes string s to the screen
    public static void putText(String s) {
        System.out.println(s);
    }

    //reads a string from the keyboard input
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    //reads a character from the keyboard input
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    // reads an integers from the keyboard input
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}