package patterns.test;

import patterns.CalculateTax;
import patterns.interfaces.Tax;
import patterns.model.Budget;
import patterns.model.Icms;
import patterns.model.Iss;

public class TestingTax {

	public static void main(String[] args) {
		
		Tax icms = new Icms();
		Tax Iss  = new Iss();
		
		CalculateTax calculate = new CalculateTax();
		Budget budget = new Budget(10D);
		
		calculate.performCalculation(budget, icms);
		calculate.performCalculation(budget, Iss);

	}

}
