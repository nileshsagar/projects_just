package spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("MyEmployee.xml");
		Employee employee=(Employee) context.getBean("e");
		System.out.println(employee);
		
	}
}
