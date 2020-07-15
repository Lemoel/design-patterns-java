package strategy;

import strategy.model.Budget;

public class CalculateTax {

	public void performCalculation(Budget budget, Tax tax) {
		double taxCalculate =  tax.calculate(budget);
		System.out.println(taxCalculate);
	}
}
