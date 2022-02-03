public abstract class Sender implements ISender {

	private double discount;
	
	public Sender(double discount) {
		this.discount = discount;
	}
	
	@Override
	public double getDiscount() {
		return discount;
	}

}