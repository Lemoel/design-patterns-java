package patterns;

import patterns.interfaces.Tax;
import patterns.model.Budget;

public class CalculateTax {

	public void performCalculation(Budget budget, Tax tax) {
		double taxCalculate =  tax.calculate(budget);
		System.out.println(taxCalculate);
	}
}
