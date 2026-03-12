class Produto {
    String nome;
    double preco;
    int quantidade;
    
    void mostrarProduto() {
        System.out.println("Produto: " + this.nome + "\n" + "Preço: " + this.preco + "\n" + "Quantidade: " + this.quantidade);
    }
    
    void calcularValorEstoque() {
        double valor = this.quantidade * this.preco;
        System.out.println("\n" + "Valor total em estoque: " + valor);
    }
}

public class Main {
  public static void main(String[] args) {
      Produto notebook = new Produto();
      
      notebook.nome = "notebook";
      notebook.preco = 3500.0;
      notebook.quantidade = 5;
      
      notebook.mostrarProduto();
      notebook.calcularValorEstoque();
  }  
}