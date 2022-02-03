package Lab3_1;

public class Application {

	public static void main(String[] args) {
		Employee rudra = new Employee("1", "Rudra", 'K', "Pandey", 1980, 2, 22, "458-58-5874", 200000);
		Employee sachin = new Employee("2", "Sachin", 'P', "Karanjit", 1987, 5, 12, "789-18-7854", 150000);
		Employee kushma = new Employee("3", "Kushma", 'K', "Thapa", 1992, 12, 15, "123-56-9874", 140000);
		Employee sandeep = new Employee("4", "Sandeep", 'S', "Sada", 1990, 11, 19, "987-46-1234", 100000);
		Employee bibek = new Employee("5", "Bibek", 'K', "Dahal", 1988, 3, 1, "654-12-6542", 160000);
		Employee suraj = new Employee("1", "Suraj", 'K', "Raut", 1989, 7, 19, "798-22-3214", 170000);
		Position director = new Position("Director", "Director of Operations");
		Position teamLead = new Position("Team Lead", "Team Lead");
		Position pm = new Position("PM", "Project Manager");
		Position po = new Position("PO", "Product Owner");
		Position analyst = new Position("Analyst", "Business Analyst");
		Position ceo = new Position("CEO", "Chief Executive Officer");
		Position hr = new Position("HR", "Human Resource");
		director.setEmployee(sachin);	
		teamLead.setEmployee(kushma);	
		pm.setEmployee(bibek);	
		analyst.setEmployee(suraj);
		hr.setEmployee(sandeep);
		ceo.setEmployee(rudra);
		Department rnd = new Department("R&D", "Sifal");
		Department gnd = new Department("G&D", "Hattisar");
		rnd.addPosition(director);
		rnd.addPosition(teamLead);
		rnd.addPosition(pm);
		rnd.addPosition(po);
		gnd.addPosition(analyst);
		gnd.addPosition(hr);
		gnd.addPosition(ceo);
		Company deerhold = new Company("Deerhold");
		deerhold.addDepartment(rnd);
		deerhold.addDepartment(gnd);
		deerhold.print();
		System.out.println("\nTotal Salary paid by company: " + 
		deerhold.getSalary());

	}
}