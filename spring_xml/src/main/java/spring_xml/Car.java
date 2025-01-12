package spring_xml;

public class Car {

	private String man;
	private double cost;
	Engine engine;
	
	public Car(String man, double cost, Engine engine) {
		
		this.man = man;
		this.cost = cost;
		this.engine = engine;
	}
	
	public void info() {
		
		System.out.println(man);
		System.out.println(cost);
		engine.hp();
		
	}
	
	
}
