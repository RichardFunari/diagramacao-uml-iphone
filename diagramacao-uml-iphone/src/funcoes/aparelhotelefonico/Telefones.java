package funcoes.aparelhotelefonico;

public class Telefones implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Fazendo ligação a partir do telefone");
    }

    public void atender() {
        System.out.println("Atendendo ligação do telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz do telefone");
    }

    public void vivaVoz() {
        System.out.println("Viva voz ativado no telefone");
    }

    public void silenciarChamada() {
        System.out.println("Chamada silenciada no telefone");
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada no telefone");
    }
}
