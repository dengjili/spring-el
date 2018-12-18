package priv.dengjl.spring_el;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.dengjl.spring_el.bean.CollectionBean;

public class CollectionDemo {

	private static final Logger logger = LoggerFactory.getLogger(CollectionDemo.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-EL-anno.xml");
		CollectionBean bean = applicationContext.getBean(CollectionBean.class);
		logger.debug("{}", bean);
	}

}
