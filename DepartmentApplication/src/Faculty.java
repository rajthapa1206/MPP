public class Faculty extends Person implements Employee{

    private double salary;

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

}