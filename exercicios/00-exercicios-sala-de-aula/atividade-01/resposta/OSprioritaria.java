public class OSprioritaria extends OrdemServico {

    OSprioritaria(String nomeCliente, String descricao, String status) {
        super(nomeCliente, descricao, status);
    }

    @Override
    public void exibirOS() {
        System.out.println("***** OS PRIORITARIA *****");
        super.exibirOS();
    }
}
