class Produto {
    String nome;
    double preco;
    int quantidade;
    
    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    void mostrarProduto() {
        System.out.println("Produto: " + this.nome + "\n" + "Preço: " + this.preco + "\n" + "Quantidade: " + this.quantidade + "\n");
    }
    
    void valorTotalEmEstoque() {
      double valor = this.quantidade * this.preco;
      
      System.out.println("Valor total em estoque: " + valor);
    }
}

class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse", 80.0, 10);
        
        mouse.mostrarProduto();
        mouse.valorTotalEmEstoque();
    }
    
}

