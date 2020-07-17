# Chain Of Responsibility - Veja os itens

- Queremos aplicar desconto dependendo de alguns critérios;
- Se a lista tiver mais que 5 itens um desconto de 10%;
- Agora continuando após verificado esta regra temos que serguir para as próximas regras;
- Se o valor do orçamento for maior do que R$ 500,00 um desconto de 7%;
- Continuando para a próximo desconto;
- Observe que dependendo da forma que isso for implementado todas as vezes que uma nova regra for adicionada vc vai ter que adicionar um novo if ou algo assim.

a) Primeira coisa a se fazer é criar uma classe para cada tipo de "regra" para separar as responsabilidades, classes: `DiscountForFiveItems` e `DiscountForMoreThanFiveHundredReais`;

b) Que a cada desconto, se ele "falhar" ou não for aplicado, ele chame o próximo desconto;

c) Então vamos criar uma interface para todos os descontos; `Discount`

``` 
public interface Discount {
	double discount(Budget budget);
	void setNext(Discount nextDescount);
}
```

d) Cada classe que trabalha com desconto deve implementar esta interface.
`DiscountForFiveItems` e `DiscountForMoreThanFiveHundredReais`;

e) Agora vamos implementar os nossos calculos de desconto, a calculadora. `CalculatorDiscount` 

```
    public double calculate (Budget budget) {

    	Discount d1 = new DiscountForFiveItems();
    	Discount d2 = new DiscountForMoreThanFiveHundredReais();
    	Discount d3 = new NoDiscount();
    	
    	d1.setNext(d2);
    	d2.setNext(d3);
    	
    	return d1.discount(budget);
    	
    }
```

f) Agora vamos testar nossa implementação. `TestingDiscount` 

```
	public static void main(String[] args) {
		
		CalculatorDiscount discounts = new CalculatorDiscount();
		
		Budget budget = new Budget(600);
		budget.addItem(new Item("caneta", 250));
		budget.addItem(new Item("lapis", 250));
		
		double discount = discounts.calculate(budget);
		
		System.out.println(discount);
	}
```

Esta ideia de cada regra ser aplicada em um cenário bem específico e se não der certo ele passar para o próximo cenário, tem um nome de Chain of Responsibility.



