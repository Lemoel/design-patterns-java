package patterns.model;

import patterns.interfaces.Tax;

public class Iss implements Tax {
	
	public double calculate (Budget budget) {
		return budget.getValue() * 0.06;
	}

}
