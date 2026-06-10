Uma empresa de streaming oferece diferentes tipos de assinaturas para seus clientes. Todas as assinaturas possuem características em comum, mas cada plano possui uma forma específica de calcular seu valor mensal.

Desenvolva um sistema orientado a objetos que atenda aos seguintes requisitos:

Crie uma classe abstrata chamada Assinatura, contendo os atributos:
- nome do assinante;
- e-mail;
- data de adesão.

A classe deve possuir um método para exibir os dados da assinatura e um método abstrato responsável por calcular o valor mensal do plano.

Crie uma classe PlanoBasico que herde de Assinatura.

O valor mensal desse plano é fixo em R$ 29,90.

Crie uma classe PlanoPremium que herde de Assinatura.

O valor mensal desse plano é fixo em R$ 59,90.

No programa principal:
- instancie um assinante do plano básico;
- instancie um assinante do plano premium;
- exiba os dados de cada assinatura;
- exiba o valor mensal correspondente.