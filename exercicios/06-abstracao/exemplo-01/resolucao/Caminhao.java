public class Caminhao extends Veiculo {
    private double custoPorKM = 3.50;

    Caminhao(String placa, String modelo, int capacidadeDeCarga) {
        super.placa = placa;
        super.modelo = modelo;
        super.capacidadeDeCarga = capacidadeDeCarga;
    }

    void ExibirValorViagem(double distancia) {
        System.out.println(super.custoDeViagem(distancia, custoPorKM));
    }
}
