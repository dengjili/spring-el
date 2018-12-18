package priv.dengjl.spring_el.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerMethod")
public class CustomerMethod {

	@Value("#{'fuck'.toUpperCase()}")
	private String name1;
	
	@Value("#{Item2bean.getName()}")
	private String name2;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Override
	public String toString() {
		return "CustomerMethod [name1=" + name1 + ", name2=" + name2 + "]";
	}
}
