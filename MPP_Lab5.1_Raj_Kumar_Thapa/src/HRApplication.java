public class HRApplication {

	private static final String pattern = "\\d{3}-\\d{3}-\\d{4}";
	
	public static void main(String[] args) {
		//employees
		Employee kushma = new Salaried("1", 5000);
		Employee suraj = new Hourly("2", 100, 40);
		Commissioned shakar = new Commissioned("3", 0.07, 2000);
		/*
		 * String x = kushma.getEmpId(); assert x == "2" : "kushma's emp id = " +
		 * kushma.getEmpId();
		 */		
		String phoneNum = "123-456-7890";
		System.out.println(phoneNum.matches(pattern));
		
		//orders
		Order order1 = new Order(1, 2021, 10, 20, 500);
		Order order2 = new Order(2, 2021, 1, 12, 400);
		Order order3 = new Order(3, 2021, 2, 10, 900);
		Order order4 = new Order(4, 2021, 9, 18, 1200);
		
		shakar.addOrder(order1);
		shakar.addOrder(order2);
		shakar.addOrder(order3);
		shakar.addOrder(order4);
		
		//paychecks
		kushma.addPayCheck(kushma.calcCompensation(1, 2021));
		kushma.addPayCheck(kushma.calcCompensation(2, 2021));
		suraj.addPayCheck(suraj.calcCompensation(1, 2021));
		suraj.addPayCheck(suraj.calcCompensation(2, 2021));
		shakar.addPayCheck(shakar.calcCompensation(1, 2021));
		shakar.addPayCheck(shakar.calcCompensation(2, 2021));
		
		//print
		kushma.print();
		suraj.print();
		shakar.print();
		
	}

}