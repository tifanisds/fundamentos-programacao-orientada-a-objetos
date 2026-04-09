public class OrdemServico {
    private static int contador = 1;
    protected int id;
    protected String nomeCliente;
    protected String descricao;
    protected String status;

    OrdemServico(String nomeCliente, String descricao, String status) {
        id = contador++;
        this.nomeCliente = nomeCliente;
        this.descricao = descricao;
        this.status = status;
    }

    OrdemServico(String nomeCliente) {
        this.id = contador++;
        this.nomeCliente = nomeCliente;
    }

    public void exibirOS() {
        System.out.println("Ordem de serviço número: " + id);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("descricao: " + descricao);
        System.out.println("Status: " + status);

    }

    public void atualizarStatus(String status) {
        this.status = status;
    }

    public void atualizarStatus(String status, String descricao) {
        this.status = status;
        this.descricao = descricao;
    }


}
