package apple_inc;

import funcoes.aparelhotelefonico.AparelhoTelefonico;
import funcoes.iphone.SmartphoneIphone;
import funcoes.navegadorinternet.NavegadorNaInternet;
import funcoes.reprodutormusical.ReprodutorMusical;

public class Apple {
    public static void main(String[] args) {
        SmartphoneIphone si = new SmartphoneIphone();

        ((AparelhoTelefonico) si).silenciarChamada();
        ((AparelhoTelefonico) si).atender();
        ((AparelhoTelefonico) si).encerrarChamada();
        ((AparelhoTelefonico) si).iniciarCorreioVoz();
        ((AparelhoTelefonico) si).ligar();
        ((AparelhoTelefonico) si).vivaVoz();

        ((ReprodutorMusical) si).tocar();
        ((ReprodutorMusical) si).aumentarVolume();
        ((ReprodutorMusical) si).diminuirVolume();
        ((ReprodutorMusical) si).pausar();
        ((ReprodutorMusical) si).selecionarMusica();

        ((NavegadorNaInternet) si).exibirPagina();
        ((NavegadorNaInternet) si).adicionarNovaAba();
        ((NavegadorNaInternet) si).fecharNavegador();
        ((NavegadorNaInternet) si).atualizarPagina();
        ((NavegadorNaInternet) si).fecharAba();
    }
}
