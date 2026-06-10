public class PlanoBasico extends Assinatura{
    Double valorPlano = 29.90;

    PlanoBasico(String nomeAssinante, String email, String dataDeAdesao) {
        super.nomeAssinante = nomeAssinante;
        super.email = email;
        super.dataDeAdesao = dataDeAdesao;
    }
}
