import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

	private String empId;
	private List<PayCheck> payCheckList = new ArrayList<PayCheck>();
	
	public Employee(String empId) {
		this.empId = empId;
	}
	
	public void print() {
		System.out.println("\nEmployee Id: " + empId);
		System.out.println("\nType: " + this.getClass().getSimpleName());
		for(PayCheck payCheck: payCheckList) {
			payCheck.print();
		}
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public List<PayCheck> getPayCheckList() {
		return payCheckList;
	}

	public void addPayCheck(PayCheck payCheck) {
		payCheckList.add(payCheck);
	}
	
	
	public PayCheck calcCompensation(int month, int year){
		DateRange payPeriod = new DateRange(LocalDate.of(year, month, 1));
		double grossPay = calcGrossPay(payPeriod);
		double fica = 0.23 * grossPay;
		double stateTax = 0.05 * grossPay;
		double localTax = 0.01 * grossPay;
		double medicare = 0.03 * grossPay;
		double socialSecurity = 0.075 * grossPay;
		PayCheck payCheck = new PayCheck(grossPay, fica, stateTax, localTax, medicare, socialSecurity, payPeriod);
	 	return payCheck;
	}
	
	public abstract double calcGrossPay(DateRange dateRange);
	
}