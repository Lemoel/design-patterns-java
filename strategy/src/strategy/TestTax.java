package strategy;

import strategy.model.Budget;
import strategy.model.Icms;
import strategy.model.Iss;

public class TestTax {

	public static void main(String[] args) {
		
		Tax icms = new Icms();
		Tax Iss  = new Iss();
		
		CalculateTax calculate = new CalculateTax();
		Budget budget = new Budget(10D);
		
		calculate.performCalculation(budget, icms);
		calculate.performCalculation(budget, Iss);

	}

}
