# Strategy - Uma calculadoura de impostos

- Para evitar que a cada imposto seja criado um novo `if` onde o cálculo é realizado dentro da classe `CalculateTax` foi feito o seguinte:
- Foi criado uma interface `Tax` que contém o contrato que cada classe de imposto deve implementar.
- Cada imposto deve ter sua classe e implementar a interface `Tax`.
- Foi criado uma classe `Budget` para conter o orçamento, apenas um valor;
- Desta forma a classe `CalculateTax.performCalculation` apenas recebe a interface `Tax`
e um orçamento, cada `Tax` "sabe" realizar o respectivo cálculo do imposto;
- Assim que surgirem mais `Tax` não será necessário nenhuma alteração além de criar o model do 
novo imposto com o método `calculate`;
- Para testar a aplicação foi utilizado a classe `TestTax`