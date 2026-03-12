# 📘 Apostila 4 — Encapsulamento

## O que é Encapsulamento?

O encapsulamento é um dos pilares da Programação Orientada a Objetos.
Ele consiste em proteger os dados de uma classe, controlando como esses dados podem ser acessados ou modificados.
Em vez de permitir que qualquer parte do programa altere diretamente os atributos de um objeto, o encapsulamento define regras de acesso.

Isso torna o código:

- mais seguro
- mais organizado
- mais fácil de manter

## Modificadores de Acesso

Em Java, utilizamos modificadores de acesso para controlar a visibilidade de atributos e métodos.

Os principais são:

| Modificador | Acesso |
|------|------|
| `public` | Pode ser acessado por qualquer classe |
| `private` | Só pode ser acessado dentro da própria classe |
| `protected` | Pode ser acessado pela classe e por subclasses |

No encapsulamento, o mais utilizado é o `private`.

## Exemplo sem Encapsulamento

```java
```java
public class ContaBancaria {

    public double saldo;

}
```
Nesse caso qualquer um poderia modificar o valor do atributo
```java
public class Programa {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria()
        conta.saldo = 400000000000000

    }

}
```
Problema:
Nada impede que alguém coloque qualquer valor, mesmo os inválidos

## Aplicando Encapsulamento
Para aplicar encapsulamento:

Tornamos os atributos private
Criamos métodos públicos para acessar ou modificar esses valores

Esses métodos são chamados de getters e setters.

### Exemplo com Encapsulamento
```java
public class ContaBancaria {

    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

}   
```

Uso:

```java
public class Programa() {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500);

        System.out.println(conta.getSaldo());
    }
}
```

## Getters e Setters

Os métodos getter e setter são utilizados para acessar e modificar atributos privados.

### Getter
Usado para obter o valor de um atributo.
```java
public double getSaldo() {
    return saldo;
}
```

### Setter
Usado para modificar o valor de um atributo.
```java
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
```

#### Exemplo completo
```java
public class Pessoa {

    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //Contrutor

    public String getNome() {
        return nome;
    }
    //Getter de nome

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Setter de nome

    public int getIdade() {
        return idade;
    }
    //Getter de idade

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Setter de idade

}
```

uso:
```java
Pessoa pessoa = new Pessoa();

pessoa.setNome("Ana");
pessoa.setIdade(25);

System.out.println(pessoa.getNome());
//Terminal: Ana
```

## Vantagens do Encapsulamento
O encapsulamento traz diversas vantagens:

- protege os dados da classe
- evita alterações indevidas
- permite validar dados antes de modificar atributos
- melhora a organização do código
