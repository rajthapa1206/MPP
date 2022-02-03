
public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount(String accountId, double interestRate, double startBalance) {
		super(accountId, startBalance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double computeUpdatedBalance() {
		return getBalance() + (interestRate * getBalance());
	}
}