public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ExibirInfo() {
        System.out.println("Informações do veículo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

    }


}
