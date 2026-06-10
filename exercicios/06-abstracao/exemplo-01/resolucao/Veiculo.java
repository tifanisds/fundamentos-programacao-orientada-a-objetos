abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected int capacidadeDeCarga;

    void verVeiculo() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidade de placa: " + this.capacidadeDeCarga);
    }

    double custoDeViagem(double distancia, double valor) {
        return distancia * valor;
    }
}
