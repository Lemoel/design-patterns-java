package strategy;

import strategy.model.Budget;

public interface Tax {
	double calculate (Budget budget);
}
