package entites;

public class Product {
	
	
	private String name;
	private Double price;
	private int quantity;
	
	public Double totalValueStock() {
		
		Double totalValue = this.getQuantity() * this.getPrice();
		return totalValue;
		
	}
	
	public void addProducts(int quantity) {
		
		
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		
	
		this.quantity = this.quantity - quantity;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product data: " + name + ", $" + price + ", " + quantity + " units, total $"
				+ totalValueStock();
	}

	

}
