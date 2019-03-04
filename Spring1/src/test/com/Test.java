package test.com;
//import org.springframework.beans.factory.BeanFactory; 

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;  
//import org.springframework.core.io.Resource;

import com.spring.customer.Customer;


public class Test {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("cust.xml");
		Customer customer=(Customer)context.getBean("CustomerDetails");
		customer.details();
		
	}

}
