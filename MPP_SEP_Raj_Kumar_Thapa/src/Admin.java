import java.util.List;

public class Admin {
	
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double balanceSum = 0;
		for (Employee emp : list) {
			balanceSum += emp.computeUpdatedBalanceSum();
		}
		return balanceSum;
	}
}