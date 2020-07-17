package patterns.negocio;

import patterns.interfaces.Discount;
import patterns.model.Budget;

public class DiscountForFiveItems implements Discount {
	
	private Discount next;

	public double discount(Budget budget) {
		if ( budget.getItens().size() > 5 ) {
			return budget.getValue() * 0.1;
		} else {
			return next.discount(budget);
		}
	}

	@Override
	public void setNext(Discount next) {
		this.next = next;
	}

}
