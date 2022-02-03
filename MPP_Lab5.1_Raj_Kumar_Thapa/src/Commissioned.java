import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	
	private double commission;
	private double baseSalary;
	private List<Order> orderList = new ArrayList<Order>();
	
	public List<Order> getOrderList(){
		return orderList;
	}
	
	public void addOrder(Order order) {
		orderList.add(order);
	}

	public Commissioned(String empId, double commission, double baseSalary) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void print() {
		System.out.println("\nType: " + this.getClass().getSimpleName());
		System.out.println("\nEmployee Id: " + super.getEmpId());
		System.out.println("\nBase Salary: " + baseSalary);
		System.out.println("\nCommission: " + commission);
		for(PayCheck payCheck: super.getPayCheckList()) {
			payCheck.print();
		}
	}
	
	public double getTotalCommission (DateRange dateRange) {
		double totalCommission = 0;
		for (Order order : orderList) {
			if (dateRange.isInRange(order.getOrderDate()))
				totalCommission += order.getOrderAmount() * commission;
		}
		return totalCommission;
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
		 */
		return baseSalary + getTotalCommission(dateRange);
	}
}