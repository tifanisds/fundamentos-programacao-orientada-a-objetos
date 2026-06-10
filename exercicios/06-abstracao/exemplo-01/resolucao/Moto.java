public class Moto extends Veiculo {
    private double custoPorKM = 1.20;

    Moto(String placa, String modelo, int capacidadeDeCarga) {
        super.placa = placa;
        super.modelo = modelo;
        super.capacidadeDeCarga = capacidadeDeCarga;
    }

    void ExibirValorViagem(double distancia) {
        System.out.println(super.custoDeViagem(distancia, custoPorKM));
    }
}
