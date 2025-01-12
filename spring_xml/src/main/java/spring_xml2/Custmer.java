package spring_xml2;

import org.springframework.beans.factory.annotation.Value;

public class Custmer {

	@Value("Bye Grocerry")
	String name;
	
	public void shop() {
		
		System.out.println("buy!");
	}
	public void start() {
		
		System.out.println("Go to the Market!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
