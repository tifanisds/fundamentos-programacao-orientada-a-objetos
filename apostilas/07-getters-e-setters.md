# 📘 Apostila 7 — Getters e Setters

## O que são Getter e Setter
Getter e Setter são métodos utilizados para acessar e modificar atributos privados de uma classe.

Eles são usados para aplicar o princípio do encapsulamento.

- Getter → serve para obter o valor de um atributo
- Setter → serve para alterar o valor de um atributo

Eles protegem os dados do objeto e permitem controlar como os valores são acessados.

## Por que usar Getter e Setter
Sem encapsulamento:
```java
class Pessoa {
    public String nome;
}
```

o problema é:
```java
Pessoa p = new Pessoa();
p.nome = null;
p.nome = "";
p.nome = "123";
```
Não há controle sobre os dados.

Com Getter e Setter:
```java
class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

## Vantagens de usar Getter e Setter
- Protege os atributos
- Permite validação
- Facilita manutenção
- Permite leitura controlada
- Permite escrita controlada
- Segue encapsulamento