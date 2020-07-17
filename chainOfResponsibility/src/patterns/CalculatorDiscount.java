package patterns;

import patterns.interfaces.Discount;
import patterns.model.Budget;
import patterns.negocio.DiscountForFiveItems;
import patterns.negocio.DiscountForMoreThanFiveHundredReais;
import patterns.negocio.NoDiscount;

public class CalculatorDiscount {

    public double calculate (Budget budget) {

    	Discount d1 = new DiscountForFiveItems();
    	Discount d2 = new DiscountForMoreThanFiveHundredReais();
    	Discount d3 = new NoDiscount();
    	
    	d1.setNext(d2);
    	d2.setNext(d3);
    	
    	return d1.discount(budget);
    	
    }

}
