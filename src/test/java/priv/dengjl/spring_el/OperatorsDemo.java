package priv.dengjl.spring_el;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.dengjl.spring_el.bean.Operators;

public class OperatorsDemo {

	private static final Logger logger = LoggerFactory.getLogger(OperatorsDemo.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-EL-anno.xml");
		Operators bean = applicationContext.getBean(Operators.class);
		logger.debug("{}", bean);
	}

}
