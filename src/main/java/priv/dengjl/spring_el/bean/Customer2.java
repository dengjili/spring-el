package priv.dengjl.spring_el.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer2Bean")
public class Customer2 {
	@Value("#{Item2bean}")
	private Item2 item;
	@Value("#{Item2bean.name}")
	private String itemName;

	public Item2 getItem() {
		return item;
	}

	public void setItem(Item2 item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Customer [item=" + item + ", itemName=" + itemName + "]";
	}
	
	
}
