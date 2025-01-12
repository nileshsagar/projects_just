package spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Car.xml");
		Car car=(Car)context.getBean("c");
		
		car.info();
		
		
	}
}
