package spring_xml;

public class Employee {

  private 	String name;
	private String designation;
	 private double sal;
	 
	 
	public Employee(String name, String designation, double sal) {
		
		this.name = name;
		this.designation = designation;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", sal=" + sal + "]";
	}
	
   
	 
	 
	
}
