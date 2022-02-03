import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Package {

	private String description;
	private double weight;
	private String zone;
	private double price;
	private ISender sender;
	private List<ICarrier> carrierList = new ArrayList<ICarrier>();
	
	public ISender getSender() {
		return sender;
	}
	
	public void setSender(ISender sender) {
		this.sender = sender;
	}
	
	public List<ICarrier> getCarrierList() {
		return carrierList;
	}
	
	public void addCarrier(ICarrier carrier) {
		carrierList.add(carrier);
	}
	
	public Package(String description, double weight, String zone) {
		this.description = description;
		this.weight = weight;
		this.zone = zone;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getZone() {
		return zone;
	}
	
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public double getLowestPrice(ISender sender) {
		double minPrice = 99999999;		
		for (ICarrier carrier : carrierList) {
			if (minPrice > carrier.getCost(sender)) minPrice = carrier.getCost(sender);
		}
		//double cost = 0;
		/*
		 * for (Object carrier : carrierList) { if (carrier instanceof UPS) { UPS c =
		 * (UPS) carrier; cost = c.getCost(); } else if (carrier instanceof USMail) {
		 * USMail c = (USMail) carrier; cost = c.getCost(); } else if (carrier
		 * instanceof FedEx) { FedEx c = (FedEx) carrier; cost = c.getCost(); } if
		 * (minPrice > cost) { minPrice = cost; } }
		 */
		return minPrice;
	}
	
	public String getCarrier(ISender sender) {
		for (ICarrier carrier : carrierList) {
			if (carrier.getCost(sender) == price) return carrier.getClass().getSimpleName();
		}
		//double cost = 0;
		/*
		 * for (Object carrier : carrierList) { if (carrier instanceof UPS) { UPS c =
		 * (UPS) carrier; cost = c.getCost(); } else if (carrier instanceof USMail) {
		 * USMail c = (USMail) carrier; cost = c.getCost(); } else if (carrier
		 * instanceof FedEx) { FedEx c = (FedEx) carrier; cost = c.getCost(); } if
		 * (price == cost) { return carrier.getClass().getSimpleName(); } }
		 */
		return null;
	}
	
	public void setPrice() {
		this.price = getLowestPrice(sender);
	}
	
	public void print() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\n"+ description + " $" + df.format(price) + " " + getCarrier(sender) + " " + sender.getClass().getSimpleName());
	}
}
