package priv.dengjl.spring_el.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Item2bean")
public class Item2 {
	
	@Value("1234张三")
	private String name;
	@Value("100")
	private int total;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", total=" + total + "]";
	}
}
