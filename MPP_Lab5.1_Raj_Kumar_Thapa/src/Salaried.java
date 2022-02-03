
public class Salaried extends Employee {
	
	private double salary;

	public Salaried(String empId, double salary) {
		super(empId);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void print() {
		System.out.println("\nType: " + this.getClass().getSimpleName());
		System.out.println("\nEmployee Id: " + super.getEmpId());
		System.out.println("\nSalary: " + salary);
		for(PayCheck payCheck: super.getPayCheckList()) {
			payCheck.print();
		}
	}

	@Override
	public double calcGrossPay(DateRange dateRange) {
		/*
		 * int months = 0; if (dateRange.getEndDate() == dateRange.getStartDate()) {
		 * months = (dateRange.getEndDate().getMonthValue() ==
		 * dateRange.getStartDate().getMonthValue()) ? 1 :
		 * (dateRange.getEndDate().getMonthValue() -
		 * dateRange.getStartDate().getMonthValue()); } else { months =
		 * ((dateRange.getEndDate().getYear() - dateRange.getStartDate().getYear()) *
		 * 12) + (dateRange.getEndDate().getMonthValue() -
		 * dateRange.getStartDate().getMonthValue()); }
		 *	return salary * months;
		 */
		return salary;
	}

}