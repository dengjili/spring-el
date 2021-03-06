package priv.dengjl.spring_el;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.dengjl.spring_el.bean.Customer;

public class HelloWordDemo {

	private static final Logger logger = LoggerFactory.getLogger(HelloWordDemo.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-EL.xml");
		Customer bean = applicationContext.getBean(Customer.class);
		logger.debug("{}", bean);
	}

}
