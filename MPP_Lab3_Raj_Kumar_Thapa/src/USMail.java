public class USMail extends Carrier{
	
	private double rate = 0.55;
	private double weight;
	
	public USMail(double weight) {
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
		double totalCost = (getWeight() < 3) ?  1.00 : getWeight() * rate;
		double discount = (sender.getDiscount() * totalCost)/100;
		return totalCost - discount ;
	}
	
}