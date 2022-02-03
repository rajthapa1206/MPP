public abstract class Carrier implements ICarrier{
	
	private double rate;
	private double weight;
	private String zone;
	
	public double getRate() {
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
		return 0;
	}

}
