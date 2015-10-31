package sharl;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	protected List<Item> items;
	
	Inventory() {
		items = new ArrayList<Item>();
	}
	
	public int addItem(Item item) {
		items.add(item);
		return items.size() - 1;
	}
	
	public boolean removeItem(Item item) {
		return items.remove(item);
	}
	
	public Item removeItem(int idx) {
		return items.remove(idx);
	}
	
	public List<Item> getItems() {
		return items;
	}
}
