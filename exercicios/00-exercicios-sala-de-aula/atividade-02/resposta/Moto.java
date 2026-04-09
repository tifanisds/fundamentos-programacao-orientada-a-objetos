public class Moto extends Veiculo {
    private int cilindradas;

    Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void ExibirInfo() {
        super.ExibirInfo();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
