package strategy.model;

import strategy.model.Budget;
import strategy.Tax;

public class Icms implements Tax {
	
	public double calculate (Budget budget) {
		return budget.getValue() * 0.1;
	}
	
}
