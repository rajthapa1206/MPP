public abstract class Account {
	private String accountId;
	private double balance;
	
	public Account(String accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	
	public String getAccountID() {
		return accountId;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double computeUpdatedBalance() {
		return 0;
	}
	
}