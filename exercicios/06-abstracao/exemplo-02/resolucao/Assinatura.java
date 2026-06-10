abstract class Assinatura {
    String nomeAssinante;
    String email;
    String dataDeAdesao;

    void exibirAssinatura() {
        System.out.println("Nome do assinante: " + this.nomeAssinante);
        System.out.println("Email: " + this.email);
        System.out.println("Data de adesão: " + this.dataDeAdesao);
    }
}
