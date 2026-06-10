public class Caminhao extends Veiculo {
    private double custoPorKM = 3.50;

    Caminhao(String placa, String modelo, int capacidadeDeCarga) {
        super.placa = placa;
        super.modelo = modelo;
        super.capacidadeDeCarga = capacidadeDeCarga;
    }

    void ExibirValorViagem(double distancia,double custoPorKM) {
        System.out.println("R$ " + super.custoDeViagem(distancia, custoPorKM));
    }

    public double getCustoPorKM() {
        return custoPorKM;
    }

    public void setCustoPorKM(double custoPorKM) {
        this.custoPorKM = custoPorKM;
    }
}
