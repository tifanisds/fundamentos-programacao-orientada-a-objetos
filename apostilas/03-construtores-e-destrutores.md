# 📘 Apostila 3 — Construtores e destrutores

## O que são Construtores?
Um construtor é um método especial utilizado para inicializar um objeto no momento em que ele é criado.

Ele é chamado automaticamente quando usamos a palavra-chave `new`.

Construtores normalmente são utilizados para:

- inicializar atributos
- garantir que o objeto seja criado com valores válidos
- evitar que atributos fiquem sem valor

## Características de um construtor
Um construtor possui algumas características importantes:

- possui o mesmo nome da classe
- não possui tipo de retorno
- é executado automaticamente na criação do objeto

## Exemplo de construtor em Java
```java
public class Pessoa {

    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        //A palavra-chave this é usada para referenciar o atributo da própria classe.
    }
    //Pessoa é o nosso construtor

}
```

Criando o objeto:
```java
public class Programa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Tífani", 19);

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        //Terminal:
        //Tífani 19

    }

}
```

## Construtor padrão
Se nenhuma classe possuir um construtor definido, o Java cria automaticamente um construtor padrão (default constructor)

```java
public class Produto {

    String nome;
    double preco;

}
```
Mesmo sem declarar um construtor, é possível criar objetos:
```java
Produto produto1 = new Produto();
```

Isso acontece porque o Java gera automaticamente um construtor vazio.

## Destrutores em Java
Diferente de algumas linguagens, Java não possui destrutores explícitos.
Isso ocorre porque o gerenciamento de memória é feito automaticamente pelo Garbage Collector (Coletor de Lixo).

O Garbage Collector é responsável por:
- identificar objetos que não estão mais sendo utilizados
- liberar automaticamente a memória ocupada por eles

Isso evita problemas como vazamento de memória.

## Método finalize()
Antigamente existia o método finalize() que poderia ser chamado antes da remoção do objeto da memória.

```java
protected void finalize() {
    System.out.println("Objeto removido da memória");
}
```

Porém, esse método não é mais recomendado e foi descontinuado nas versões modernas do Java.
Hoje o controle de memória é feito exclusivamente pelo Garbage Collector.