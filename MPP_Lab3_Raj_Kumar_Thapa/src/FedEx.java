
public class FedEx extends Carrier{

	private double rate;
	private double weight;
	private String zone;
	
	public FedEx(double weight, String zone) {
		this.weight = weight;
		this.zone = zone;
	}
	
	public double getRate() {
		switch (zone) {
		case "IA":
		case "MT":
		case "OR":
		case "CA":
			rate = 0.35;
			break;
		case "TX":
		case "UT":
			rate = 0.30;
			break;
		case "FL":
		case "MA":
		case "OH":
			rate = 0.55;
			break;
		default:
			rate = 0.43;
			break;
		}
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
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
	
	@Override
	public double getCost(ISender sender) {	
		double totalCost = getRate() * getWeight();
		double discount = (sender.getDiscount() * totalCost)/100;
		return totalCost - discount ;
	}
}