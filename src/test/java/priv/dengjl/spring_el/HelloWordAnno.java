package priv.dengjl.spring_el;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.dengjl.spring_el.bean.Customer2;

public class HelloWordAnno {

	private static final Logger logger = LoggerFactory.getLogger(HelloWordAnno.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-EL-anno.xml");
		Customer2 bean = applicationContext.getBean(Customer2.class);
		logger.debug("{}", bean);
	}

}
