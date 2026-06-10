import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUAL PLANO VC DESEJA?");
        System.out.println("Digite 1 para o plano básico e 2 para o premium");
        String valor = scanner.nextLine();

        if(valor.equals("1")) {
            PlanoBasico plano = new PlanoBasico("Tífani Sá", "tifanisa@hotmail.com", "10/06/2026");
            System.out.println("R$ " + plano.valorPlano);
            plano.exibirAssinatura();
        }

        if(valor.equals("2")) {
            PlanoPremium plano = new PlanoPremium("Paula Santos", "paula@hotmail.com", "09/06/2026");
            System.out.println("R$ " + plano.valorPlano);
            plano.exibirAssinatura();
        }
    }
}