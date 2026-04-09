1. Crie um sistema em que o cliente escolhe o método de pagamento (cartão de crédito ou boleto bancário) e informa o valor do pagamento. O sistema deve calcular o total do pagamento considerando descontos ou taxas de processamento para diferentes métodos de pagamento. Se o valor inserido for inválido (por exemplo, um valor negativo), o sistema deve lançar exceções adequadas.

## Passos do exercício:

- Classe abstrata MetodoPagamento: Esta classe terá um método abstrato calcularTotal() que calculará o total a ser pago, levando em consideração o valor do pedido e as taxas/descontos aplicados.

- Classes concretas: CartaoCredito e BoletoBancario devem estender a classe abstrata MetodoPagamento e implementar o método calcularTotal(). O cartão de crédito pode ter uma taxa de processamento de 5%, e o boleto bancário pode ter um desconto de 2%.

- Leitura de dados com exceções: O programa deve tratar exceções se o valor do pagamento for negativo ou se o tipo de pagamento não for reconhecido.

- Exibição do resultado: O programa deve exibir o total a ser pago com o método de pagamento escolhido.