package patterns.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {
	
	private final double value;
	private final List<Item> itens;

	public Budget(double value) {
		this.value = value;
		this.itens = new ArrayList<Item>();
	}

	public double getValue() {
		return value;
	}

	public void addItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
}
