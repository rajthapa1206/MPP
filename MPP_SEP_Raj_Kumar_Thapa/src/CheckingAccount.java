public class CheckingAccount extends Account {
	private double monthlyFee;

	public CheckingAccount(String accountId, double monthlyFee, double startBalance) {
		super(accountId, startBalance);
		this.monthlyFee = monthlyFee;
	}
	
	public double getMonthlyFee() {
		return monthlyFee;
	}
	
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	@Override
	public double computeUpdatedBalance() {
		return getBalance() - monthlyFee;
	}
}