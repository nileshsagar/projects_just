package spring_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Shop.xml");
		
		Shop shop=(Shop) context.getBean("s");
		System.out.println(shop.info());
	}
}
