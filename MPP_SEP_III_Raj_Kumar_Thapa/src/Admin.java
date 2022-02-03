public class Admin {
	//implement
	private Department[] departments;
	
	public Admin(Department[] depts) {
		this.departments = depts;
	}
	
	public String hourlyCompanyMessage() {
		String msg = "";
		try {
			for (Department department : departments) {
				msg += "\n" + format(department.getName(), department.nextMessage());
			}	
		}
		catch (EmptyQueueException e) {
			System.out.println("Exception: " + e);
		}
		return msg;
	}
	
	public String format(String name, String msg) {
		return name + ": " + msg;
	}
	
}