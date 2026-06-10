import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para caminhao e 2 para moto");
        String valor = scanner.nextLine();

        if(valor.equals("1")) {
            Caminhao caminhao = new Caminhao("Hd6GD5", "Truck", 22000);
            caminhao.verVeiculo();
            caminhao.ExibirValorViagem(22000, caminhao.getCustoPorKM());
        }

        if(valor.equals("2")) {
            Moto moto = new Moto("FJ939J", "Scooter", 300);
            moto.verVeiculo();
            moto.ExibirValorViagem(300, moto.getCustoPorKM());
        }
    }
}