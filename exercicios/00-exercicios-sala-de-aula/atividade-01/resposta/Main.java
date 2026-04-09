
public class Main {

    public static void main(String[] args) {
        OrdemServico novaOS = new OrdemServico("Tífani", "Essa é uma nova ordem de serviço", "ativa");
        novaOS.exibirOS();

        OSprioritaria novaOSprioritaria = new OSprioritaria("Julia", "Essa é uma nova ordem de serviço", "ativa");
        novaOSprioritaria.exibirOS();

    }

}
