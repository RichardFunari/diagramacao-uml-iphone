package funcoes.iphone;


import funcoes.aparelhotelefonico.AparelhoTelefonico;
import funcoes.navegadorinternet.NavegadorNaInternet;
import funcoes.reprodutormusical.ReprodutorMusical;

public class SmartphoneIphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("Fazendo ligação a partir do Iphone");
    }

    public void atender() {
        System.out.println("Atendendo ligação no Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz do Iphone");
    }

    public void vivaVoz() {
        System.out.println("Viva voz ativado no Iphone");
    }

    public void silenciarChamada() {
        System.out.println("Chamada silenciada no Iphone");
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada no Iphone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página do navegador no Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador no Iphone");
    }

    public void atualizarPagina() {
        System.out.println("A página do navegador foi atualizada no Iphone");
    }

    public void fecharAba() {
        System.out.println("Fechando aba do navegador no Iphone");
    }

    public void fecharNavegador() {
        System.out.println("O navegador no Iphone será fechado");
    }

    public void tocar() {
        System.out.println("Tocando música no Iphone");
    }

    public void pausar() {
        System.out.println("Música pausada no Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando nova música no Iphone");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume do Iphone");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o volume do Iphone");
    }
}
