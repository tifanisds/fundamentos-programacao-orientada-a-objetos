public class Carro extends Veiculo {
    private int numeroDePortas;


    Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void ExibirInfo() {
        super.ExibirInfo();
        System.out.println("Número de portas: " + numeroDePortas);

    }

}
