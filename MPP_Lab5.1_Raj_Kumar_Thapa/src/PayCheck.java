public class PayCheck {
	private double grossPay;
	private double fica = 0.23;
	private double stateTax = 0.05;
	private double localTax = 0.01;
	private double medicare = 0.03;
	private double socialSecurity = 0.075;
	private DateRange payPeriod;
	
	public PayCheck(double grossPay, double fica, double stateTax, double localTax, double medicare, double socialSecurity, DateRange payPeriod) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.stateTax = stateTax;
		this.localTax = localTax;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
	}
	
	public double getGrossPay() {
		return grossPay;
	}
	
	public double getFica() {
		return fica;
	}
	
	public double getStateTax() {
		return stateTax;
	}
	
	public double getLocalTax() {
		return localTax;
	}
	
	public double getMedicare() {
		return medicare;
	}
	
	public double getSocialSecurity() {
		return socialSecurity;
	}
	
	public DateRange getPayPeriod() {
		return payPeriod;
	}
	
	public void print() {
		System.out.println("\nGross Pay: " + getGrossPay() +
				"\nFica: " + getFica() +
				"\nState Tax: " + getStateTax() +
				"\nLocal Tax: " + getLocalTax() +
				"\nMedicare: " + getMedicare() +
				"\nSocial Security: " + getSocialSecurity() +
				"\nPay Period: " + getPayPeriod().toString());
	}
	
	public double getNetPay() {
		return grossPay - (fica + stateTax + localTax + medicare + socialSecurity);
	}
	
}