package patterns.test;

import patterns.CalculatorDiscount;
import patterns.model.Budget;
import patterns.model.Item;

public class TestingDiscount {

	public static void main(String[] args) {
		
		CalculatorDiscount discounts = new CalculatorDiscount();
		
		Budget budget = new Budget(600);
		budget.addItem(new Item("caneta", 250));
		budget.addItem(new Item("lapis", 250));
		
		double discount = discounts.calculate(budget);
		
		System.out.println(discount);
	}

}
