package patterns.negocio;

import patterns.interfaces.Discount;
import patterns.model.Budget;

public class NoDiscount implements Discount {

	private Discount next;

	@Override
	public double discount(Budget budget) {		
		return 0;
	}

	@Override
	public void setNext(Discount next) {
		//não tem próximo	
	}

}
