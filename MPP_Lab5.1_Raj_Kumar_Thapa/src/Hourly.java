
public class Hourly extends Employee {

	private double hourlyWage;
	private int hoursPerWeek;

	public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public void print() {
		System.out.println("\nType: " + this.getClass().getSimpleName());
		System.out.println("\nEmployee Id: " + super.getEmpId());
		System.out.println("\nHourly Wage: " + hourlyWage);
		System.out.println("\nHours per Week: " + hoursPerWeek);
		for(PayCheck payCheck: super.getPayCheckList()) {
			payCheck.print();
		}
	}

	@Override
	public double calcGrossPay(DateRange dateRange) {
		/*
		 * int weeks = 0; if (dateRange.getEndDate() == dateRange.getStartDate()) {
		 * weeks = (dateRange.getEndDate().getMonthValue() ==
		 * dateRange.getStartDate().getMonthValue()) ? 4 :
		 * (dateRange.getEndDate().getMonthValue() -
		 * dateRange.getStartDate().getMonthValue()) * 4; } else { weeks =
		 * (((dateRange.getEndDate().getYear() - dateRange.getStartDate().getYear()) *
		 * 12) + (dateRange.getEndDate().getMonthValue() -
		 * dateRange.getStartDate().getMonthValue())) * 4; }
		 */
		return hourlyWage * hoursPerWeek * 4;
	}
}