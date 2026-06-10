Uma empresa de logística utiliza diferentes tipos de veículos para realizar entregas em todo o país. Apesar de cada veículo possuir características específicas, todos compartilham algumas informações básicas, como placa, modelo e capacidade de carga.

Sabendo disso, desenvolva um sistema orientado a objetos que atenda aos seguintes requisitos:

Crie uma classe abstrata chamada Veiculo, contendo os atributos:
- placa;
- modelo;
- capacidade de carga.

A classe deve possuir um método para exibir as informações do veículo e um método abstrato responsável por calcular o custo de uma viagem.

Crie uma classe Caminhao que herde de Veiculo. O custo da viagem deve ser calculado multiplicando a distância percorrida por R$ 3,50.

Crie uma classe Moto que herde de Veiculo. O custo da viagem deve ser calculado multiplicando a distância percorrida por R$ 1,20.

No programa principal, instancie um caminhão e uma moto com dados fictícios.
Exiba na tela:
- as informações de cada veículo;
- o custo de uma viagem de 100 km para cada um deles.