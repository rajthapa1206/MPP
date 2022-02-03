import java.time.LocalDate;

public class Order {

	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	public Order(int orderNo, int year, int month, int day, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = LocalDate.of(year, month, day);
		this.orderAmount = orderAmount;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
	
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
}