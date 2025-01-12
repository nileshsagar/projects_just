package spring_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputeDriver {

	public static void main(String[] args) {
//		
//		Computer c=new Computer();
//		c.used();

		// Using Spring
		
		BeanFactory factory=new ClassPathXmlApplicationContext("Main.xml");
		Computer computer=(Computer) factory.getBean("comp");
		
		System.out.println(computer);
		
		Computer computer2=(Computer) factory.getBean("comp");
		
		System.out.println(computer2);
//		computer.used();
	}
}
