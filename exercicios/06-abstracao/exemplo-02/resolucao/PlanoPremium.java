public class PlanoPremium extends Assinatura{
    Double valorPlano = 59.90;

    PlanoPremium(String nomeAssinante, String email, String dataDeAdesao) {
        super.nomeAssinante = nomeAssinante;
        super.email = email;
        super.dataDeAdesao = dataDeAdesao;
    }
}
