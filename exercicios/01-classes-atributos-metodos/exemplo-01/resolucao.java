class Carro {
    String marca;
    String modelo;
    int ano;
        
    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca + "\n" + "Modelo: " + this.modelo + "\n" + "Ano: " + this.ano);
    }
}

public class Main
{
    public static void main(String[] args) {
        Carro corolla = new Carro();
        
        corolla.marca = "Toyota";
        corolla.modelo = "Corolla";
        corolla.ano = 2022;
        
        corolla.exibirInformacoes();
    }
}