import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Company {
	private String companyName;
	private String companyCity;
	private String companyState;
	private double totalProfitForThisYear;
	public Company(String companyName, String companyCity, String companyState, double totalProfitForThisYear) {
		this.companyName = companyName;
		this.companyCity = companyCity;
		this.companyState = companyState;
		this.totalProfitForThisYear = totalProfitForThisYear;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCompanyState() {
		return companyState;
	}
	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}
	public double getTotalProfitForThisYear() {
		return totalProfitForThisYear;
	}
	public void setTotalProfitForThisYear(double totalProfitForThisYear) {
		this.totalProfitForThisYear = totalProfitForThisYear;
	}
	@Override
	public String toString() {
		return "Company Name: " + getCompanyName() +
				" Company City: " + getCompanyCity() +
				" Company State: " + getCompanyState() +
				" Total Profit For This Year: " + getTotalProfitForThisYear();
	}
	
	public static void main(String[] args) {
		List<Company> arr1 = new ArrayList<Company>();
		arr1.add(new Company("Microsoft", "Charlotte", "North Carolina", 2345000));
		arr1.add(new Company("Google", "Washington", "District Of Columbia", 1234500));
		arr1.add(new Company("Apple", "Macon", "Georgia", 5345800));
		arr1.add(new Company("Facebook", "Newark", "Delaware", 4445000));
		arr1.add(new Company("IBM", "Cedar Rapids", "Iowa", 2245000));
		arr1.add(new Company("Amazon", "Omaha", "Nebraska", 4545000));
		arr1.add(new Company("Cotiviti", "Moorhead", "Minnesota", 1345000));
		arr1.add(new Company("Zakipoint", "Houston", "Texas", 45000));
		arr1.add(new Company("Deerhold", "Hollywood", "Florida", 234500));
		arr1.add(new Company("Deem", "Modesto", "California", 234500));
		arr1.add(new Company("Higi", "Chicago", "Illionis", 234500));
		arr1.add(new Company("Apple", "Macon", "Georgia", 5345800));
		
		System.out.println("Companies city whose City name starts with M:");
		arr1.stream()
		.filter(c -> (c.getCompanyCity().startsWith("M")))
		.sorted(Comparator.comparing(Company::getCompanyCity))
		.map(Company::getCompanyCity)
		.distinct()
		.forEach(System.out::println);
		
		System.out.printf("Average of all the totalProfitForThisYear: %.2f",
				arr1.stream()
				.mapToDouble(Company::getTotalProfitForThisYear)
				.average().getAsDouble());
		
		System.out.printf("\nSum of all the totalProfitForThisYear: %.2f", 
				arr1.stream()
				.mapToDouble(Company::getTotalProfitForThisYear)
				.reduce(0, (a,b)-> a + b));
		
		System.out.println("Company Details: ");
		arr1.stream()
		.map(obj -> {
	    	  if (obj.getCompanyCity().startsWith("T")) {
	    	  return new Company(obj.getCompanyName(),
	    	  obj.getCompanyCity().toUpperCase(),
	    	  obj.getCompanyState(),
	    	  obj.getTotalProfitForThisYear());
	    	  }
	    	  return obj;
	    	  })
		.forEach(System.out::println);
		
		System.out.println("Company Details whose state is Nebraska and Profit for this year is greater than $4,000,000: ");
		arr1.stream()
		.filter(c -> (c.getCompanyState().equals("Nebraska") && 
				c.getTotalProfitForThisYear() > 4000000.00))
		.forEach(System.out::println);
		
		System.out.println("Company Details: ");
		Stream.concat(
				arr1.stream()
				.filter(c -> (c.getCompanyState().startsWith("D")))
				.sorted(Comparator.comparing(Company::getCompanyState)), 
				arr1.stream()
				.filter(c -> (!c.getCompanyState().startsWith("D"))))
		.forEach(System.out::println);
		
		List<Company> comp = arr1.stream()
				.map(obj -> {
			    	  if (obj.getCompanyCity().startsWith("Mo")) {
			    	  return new Company(obj.getCompanyName(),
			    	  obj.getCompanyCity().toUpperCase(),
			    	  obj.getCompanyState(),
			    	  obj.getTotalProfitForThisYear());
			    	  }
			    	  return obj;
			    	  })
				.collect(Collectors.toList());
		
		//System.out.println(comp);
		
		System.out.println("Company Details starting with city name C, H and later on: ");
		Stream.concat(Stream.concat(arr1.stream()
				.filter(c -> (c.getCompanyCity().startsWith("C"))), 
				arr1.stream()
				.filter(c -> (c.getCompanyCity().startsWith("H")))),
				arr1.stream()
				.filter(c -> !(c.getCompanyCity().startsWith("H") || c.getCompanyCity().startsWith("C"))))
		.forEach(System.out::println);
		
		
	}
}