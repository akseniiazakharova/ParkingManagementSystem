package Cafe;

public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}

	@Override
    public String toString() {
        return name + " — " + price + " $";
    }
	
	
	public String getName() {
		return name;
		
	}
	
	public double getPrice() {
		return price;
		
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
			
		}
		
		
		
	}
	

}
