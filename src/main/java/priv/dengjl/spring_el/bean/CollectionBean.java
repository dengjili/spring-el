package priv.dengjl.spring_el.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CollectionBean {
	
	@Value("#{testBean.map[MapB]}")
	private String name;
	@Value("#{testBean.list[0]}")
	private String name2;

	public String getName() {
		return name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CollectionBean [name=" + name + ", name2=" + name2 + "]";
	}
	
}
