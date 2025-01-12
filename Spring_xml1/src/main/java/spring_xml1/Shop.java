package spring_xml1;

public class Shop {

	private int id;
	private String name;
    Laptop laptop;
    
	public Shop(int id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}
	
	
	public String info() {
		return "Shop [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}
    
    
	
}
