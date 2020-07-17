package patterns.interfaces;

import patterns.model.Budget;

public interface Discount {
	double discount(Budget budget);
	void setNext(Discount nextDescount);
}
