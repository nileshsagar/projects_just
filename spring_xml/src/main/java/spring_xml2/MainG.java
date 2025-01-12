package spring_xml2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainG {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("New.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
//		 Custmer custmer=(Custmer) factory.getBean("com");
		 Custmer custmer1= factory.getBean(Custmer.class);
		
	}
}
