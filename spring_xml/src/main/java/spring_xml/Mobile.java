package spring_xml;

public class Mobile {

	 String company;
	 double price;
	
	Sim sim;
	
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	
	
	
	public void info() {
		
		System.out.println("Mobile [company=" + company + ", price=" + price + ", sim=" + sim );
	}
	public void used() {
		
		sim.serviceProvider(); 
	}
	
}
