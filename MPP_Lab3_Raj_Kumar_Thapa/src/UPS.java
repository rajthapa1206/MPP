public class UPS extends Carrier{
	
	private double rate = 0.45;
	private double weight;
	
	public UPS(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public double getCost(ISender sender) {
		double totalCost = rate * getWeight();
		double discount = (sender.getDiscount() * totalCost)/100;
		return totalCost - discount ;
	}
}