package spring_xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		
//		BeanFactory factory=new ClassPathXmlApplicationContext("Mob.xml");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Mob.xml");
		
	Mobile mobile=(Mobile) context.getBean("m");
		mobile.info();
	}
	
}
