package ex;

public class Product {
	
	private int id;
	private String name;
	private double cost;
	private int rating;
	
	public Product() {
		
	}
	
	public Product (int id, String name, double cost, int rating) {
		
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		
	}
	
	@Override
	public String toString() {
		return "Product [id =" + id + ", name =" + name + ", cost =" + cost +  ", rating ="
				+ rating + "]";
	}

}
 