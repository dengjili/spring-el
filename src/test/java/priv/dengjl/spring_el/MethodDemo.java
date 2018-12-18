package priv.dengjl.spring_el;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.dengjl.spring_el.bean.CustomerMethod;

public class MethodDemo {

	private static final Logger logger = LoggerFactory.getLogger(MethodDemo.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-EL-anno.xml");
		CustomerMethod bean = applicationContext.getBean(CustomerMethod.class);
		logger.debug("{}", bean);
	}

}
