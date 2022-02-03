import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accountList = new ArrayList<Account>();
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public List<Account> getAccountList(){
		return accountList;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	public double computeUpdatedBalanceSum() {
		double balanceSum = 0;
		for (Account account : accountList) {
			balanceSum += account.computeUpdatedBalance();
		}
		return balanceSum;
	}
}