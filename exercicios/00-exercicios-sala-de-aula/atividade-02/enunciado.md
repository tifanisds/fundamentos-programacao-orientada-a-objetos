## Escopo geral:

Exercício: Sistema de Veículos

Objetivo: Praticar o conceito de herança em Java criando uma hierarquia de classes para um sistema de veículos.

Descrição:

1. Criar a classe Veiculo com os seguintes atributos:

marca (String)
modelo (String)
ano (int)
Além disso, a classe deve ter:
Um construtor que inicializa os atributos.
Um método exibirInfo() que imprime as informações do veículo.

2. Criar a classe Carro, que herda de Veiculo, e adicionar:

numeroPortas (int)
Um construtor que recebe os atributos do veículo e o número de portas.
Um método exibirInfo() sobrescrito para incluir o número de portas.

3. Criar a classe Moto, que também herda de Veiculo, e adicionar:

cilindradas (int)
Um construtor que recebe os atributos do veículo e as cilindradas.
Um método exibirInfo() sobrescrito para incluir as cilindradas.

4. Criar uma classe Main para testar o sistema:

Criar um objeto Carro e um objeto Moto.
Chamar exibirInfo() para cada um deles