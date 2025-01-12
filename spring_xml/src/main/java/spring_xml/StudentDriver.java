package spring_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
		BeanFactory factory= new ClassPathXmlApplicationContext("New.xml");
		Student student=(Student) factory.getBean("com");
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		
	}
}
