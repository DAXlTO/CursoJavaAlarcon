package indra.talentCamp.encapsulamiento.models;

public class ProductoElectronico {

	private String name;
    private double price;
    private int stock;
    private String brand;
    
    public ProductoElectronico(String name, double price, int stock, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
	}
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void refreshStock(int stock) throws Exception {	
		if (this.stock - stock < 0) {
			throw new Exception();
		}
		this.stock -= stock;
	}
    
}
