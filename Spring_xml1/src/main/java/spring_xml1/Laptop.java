package spring_xml1;

public class Laptop {

	private String brand;
	private double price;
	private String processor;
	private String ram;
	
	public Laptop(String brand, double price, String processor, String ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", processor=" + processor + ", ram=" + ram + "]";
	}
	
	
	
}
