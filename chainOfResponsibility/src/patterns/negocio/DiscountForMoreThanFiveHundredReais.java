package patterns.negocio;

import patterns.interfaces.Discount;
import patterns.model.Budget;

public class DiscountForMoreThanFiveHundredReais implements Discount {
	
	private Discount next;

	public double discount(Budget budget) {
		
		if (budget.getValue() > 500 ) {
			return budget.getValue() * 0.07;
		} else {
			return next.discount(budget);
		}
		
	}

	@Override
	public void setNext(Discount next) {
		this.next = next;
	}
	
}
